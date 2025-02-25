package com.awareInterface;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class ResourceLoader implements ResourceLoaderAware{

	@Override
	public void setResourceLoader(org.springframework.core.io.ResourceLoader resourceLoader) {

              Resource resource =  resourceLoader.getResource("file:C:\\Users\\HP\\Downloads\\banner.txt");
              try {
				     InputStream stream =   resource.getInputStream();
				     BufferedReader br = new BufferedReader(new InputStreamReader(stream));
				     String line = br.readLine(); 
				     while(line != null)
				     {
				    	 System.out.println(line);
				    	 line = br.readLine();
				     }
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}

}
