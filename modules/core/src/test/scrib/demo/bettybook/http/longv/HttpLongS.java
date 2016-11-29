package demo.bettybook.http.longv;

import static demo.bettybook.http.longv.HttpLong.Http.Http.ACCEPT;
import static demo.bettybook.http.longv.HttpLong.Http.Http.ACCEPTE;
import static demo.bettybook.http.longv.HttpLong.Http.Http.ACCEPTL;
import static demo.bettybook.http.longv.HttpLong.Http.Http.BODY;
import static demo.bettybook.http.longv.HttpLong.Http.Http.C;
import static demo.bettybook.http.longv.HttpLong.Http.Http.CONNECTION;
import static demo.bettybook.http.longv.HttpLong.Http.Http.DNT;
import static demo.bettybook.http.longv.HttpLong.Http.Http.HOST;
import static demo.bettybook.http.longv.HttpLong.Http.Http.REQUESTL;
import static demo.bettybook.http.longv.HttpLong.Http.Http.S;
import static demo.bettybook.http.longv.HttpLong.Http.Http.USERA;
import static demo.bettybook.http.longv.HttpLong.Http.Http.UPGRADEIR;

import java.io.IOException;

import org.scribble.main.ScribbleRuntimeException;
import org.scribble.net.Buf;
import org.scribble.net.scribsock.ScribServerSocket;
import org.scribble.net.scribsock.SocketChannelServer;
import org.scribble.net.session.MPSTEndpoint;

import demo.bettybook.http.longv.HttpLong.Http.Http;
import demo.bettybook.http.longv.HttpLong.Http.channels.S.Http_S_1;
import demo.bettybook.http.longv.HttpLong.Http.channels.S.Http_S_2;
import demo.bettybook.http.longv.HttpLong.Http.channels.S.Http_S_2_Cases;
import demo.bettybook.http.longv.HttpLong.Http.roles.S;
import demo.bettybook.http.longv.message.Body;
import demo.bettybook.http.longv.message.HttpLongMessageFormatter;
import demo.bettybook.http.longv.message.server.ContentLength;
import demo.bettybook.http.longv.message.server.HttpVersion;
import demo.bettybook.http.longv.message.server._200;

public class HttpLongS
{
	public static void main(String[] args) throws Exception
	{
		try (ScribServerSocket ss = new SocketChannelServer(8080)) {
			while (true)	{
				Http http = new Http();
				try (MPSTEndpoint<Http, S> server = new MPSTEndpoint<>(http, S, new HttpLongMessageFormatter())) {
					server.accept(ss, C);
				
					run(new Http_S_1(server));
				}
				catch (IOException | ClassNotFoundException | ScribbleRuntimeException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	private static void run(Http_S_1 s1) throws ClassNotFoundException, ScribbleRuntimeException, IOException {
		Buf<Object> buf = new Buf<>();
		
		Http_S_2 s2 = s1.receive(C, REQUESTL, buf);
		System.out.println("Requested: " + buf.val);
		
		Y: while (true) {
			Http_S_2_Cases cases = s2.branch(C);
			switch (cases.op) {
				case ACCEPT:  s2 = cases.receive(ACCEPT, buf); break;
				case ACCEPTE: s2 = cases.receive(ACCEPTE, buf); break;
				case ACCEPTL: s2 = cases.receive(ACCEPTL, buf); break;
				case BODY:
				{
					String body = "<html><body>Hello, World!</body></html>";
					cases.receive(BODY, buf)
						.send(C, new HttpVersion("1.1"))
						.send(C, new _200("OK"))
						.send(C, new ContentLength(body.length()))
						.send(C, new Body(body));
					break Y;
				}
				case CONNECTION: s2 = cases.receive(CONNECTION, buf); break;
				case DNT:        s2 = cases.receive(DNT, buf); break;
				case UPGRADEIR:  s2 = cases.receive(UPGRADEIR, buf); break;
				case HOST:       s2 = cases.receive(HOST, buf); break;
				case USERA:      s2 = cases.receive(USERA, buf); break;
			}
		}
	}
}
