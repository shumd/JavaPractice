package ru.shumilin.spring.streamingPlatform;


import lombok.AllArgsConstructor;

import java.io.File;
import java.util.function.Supplier;

@AllArgsConstructor
public class Start implements Readable<File>, Supplier<File> {
    String fileToReadName;
    String fileToWriteName;



    @Override
    public void read(File obj) {

    }

    @Override
    public File get() {
        return new File(fileToWriteName);
    }
}
