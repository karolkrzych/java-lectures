package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Synchronizator {

    private File source;
    private File target;

    public Synchronizator(File source, File target) {
        this.source = source;
        this.target = target;
    }

    public void synchronize() throws IOException {
        if (source.isDirectory()) {
            for (File f : source.listFiles()) {
                boolean missing = isMissingFile(f.getName(), target.listFiles());
                if (f.isFile()) {

                    if (missing) {
                        Files.copy(Path.of(f.getAbsolutePath()),
                                Path.of(target.getAbsolutePath() + File.separator + f.getName()),
                                StandardCopyOption.REPLACE_EXISTING);
                    }
                } else if (f.isDirectory()) {
                    if (missing) {
                        Path missingPath = Files.createDirectories(Path.of(
                                f.getAbsolutePath().replace(source.getAbsolutePath(), target.getAbsolutePath())));

                        Synchronizator synchronizator = new Synchronizator(f, missingPath.toFile());
                        synchronizator.synchronize();
                    }
                }
            }
        }
    }


    public boolean isMissingFile(String name, File[] files) {

        for (File f : files) {
            if (f.getName().equals(name)) {
                return false;
            }

        }
        return true;
    }


}
