package com.hacker.rank.practice;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URLEncoderDecoder {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String decodedUrl = URLDecoder.decode("https://anzlaw.demo.thomsonreuters.com/Link/Document/Blob/Ie5cab690e6fb11ec9e6e8fde01a1b09b/[2022]_FedCFamC2G_439.rtf?originationContext=Search%20Result&amp;transitionType=SearchItem&amp;contextData=%28sc.Default%29&amp;alertGuid=i0accd0ab000001734f7b7d0eeabe0512&amp;rank=2&amp;list=PublicationAlertProducerNext&amp;listSource=Alert&amp;navigationPath=Alert%2Fv1%2FlistNavigation%2FPublicationAlertProducerNext%2Fi0accd3a60000018147483e0ba1294ebb%3Frank%3D2%26alertGuid%3Di0accd0ab000001734f7b7d0eeabe0512%26transitionType%3DSearchItem%26originationContext%3DSearch%2520Result%26groupId%3DTRSSO%26contextData%3D%2528sc.Default%2529\" type=\"application/rtf",
				"UTF-8");
		
		System.out.print(decodedUrl);
	}

}
