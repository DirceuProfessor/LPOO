package br.unip.lpoo.threads;

import java.sql.SQLException;

import javax.net.ssl.SSLException;
import javax.xml.ws.ProtocolException;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.http.HTTPException;

public class ExcecaoLaboratorio {

	public ExcecaoLaboratorio() //throws NullPointerException 
	{
		throw new WebServiceException();
//		System.out.println("VX");
//		throw new ProtocolException();
//		throw new HTTPException(1);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
