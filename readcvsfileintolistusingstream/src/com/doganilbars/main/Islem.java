package com.doganilbars.main;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.doganilbars.entity.Product;

public class Islem {
	public static void main(String[] args) {
		
		try {
			
			String path ="C:/ilbars/java8/product.csv";
			List<Product> products=new ArrayList();
			Stream<String> stream=Files.lines(Paths.get(path));
			products = stream.filter(line->line.contains("lap")).map(line->{
				String[] result= line.split(";");
				return new Product(result[0],result[1],Double.parseDouble(result[2]));
			}).collect(Collectors.toList());
			
			System.out.println("Product List");
			for (Product product : products) {
				
				System.out.println("Ýd: "+product.getId());
				System.out.println("Ýsim: "+product.getIsim());
				System.out.println("Ücret: " + product.getUcret());
				System.out.println("==================================");
				
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
