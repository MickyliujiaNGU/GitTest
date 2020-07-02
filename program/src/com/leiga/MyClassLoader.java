package com.leiga;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyClassLoader extends ClassLoader {
    private final static Path DEFAULT_CLASS_DIR = Paths.get("G:", "classloader1");
    private final Path classDir;

    public MyClassLoader() {
        this.classDir = DEFAULT_CLASS_DIR;
    }

    public MyClassLoader(Path classDir) {
        this.classDir = classDir;
    }

    public MyClassLoader(Path classDir, ClassLoader classLoader) {
        super(classLoader);
        this.classDir = classDir;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] bytes = this.readClassBytes(name);
        if (bytes == null || bytes.length == 0) {
            throw new ClassNotFoundException("The class " + name + " load is empty");
        }
        return this.defineClass(name, bytes, 0, bytes.length);
    }

    private byte[] readClassBytes(String name) throws ClassNotFoundException {
        String classPath = name.replace(".", "/");
        Path classFullPath = classDir.resolve(Paths.get(classPath + ".class"));
        if (!classFullPath.toFile().exists()) {
            throw new ClassNotFoundException("The class" + name + " not found");
        }
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            Files.copy(classFullPath, baos);
            return baos.toByteArray();
        } catch (IOException e) {
            throw new ClassNotFoundException("load the class " + name + " occur error." + e);
        }
    }
}
