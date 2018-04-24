package com.doganilbars.main;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Islem {
	public static void main(String[] args) {

		try {
			String path = "C:/ilbars/java8/";
			Path startDir = Paths.get(path);
			String pattern = "*.{txt,xml}";
			FileSystem fileSystem = FileSystems.getDefault();
			PathMatcher pathMatcher = fileSystem.getPathMatcher("glob:" + pattern);
			FileVisitor fileVisitor = new SimpleFileVisitor() {
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					Path name = file.getFileName();
					if (pathMatcher.matches(name)) {
						System.out.println("Found matched file: " + name);
					}
					return FileVisitResult.CONTINUE;
				}

			};
			Files.walkFileTree(startDir, fileVisitor);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
