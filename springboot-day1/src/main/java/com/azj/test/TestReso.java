package com.azj.test;

import java.io.IOException;
import java.io.InputStream;

public class TestReso implements AutoCloseable {
    @Override
    public void close() throws Exception {
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

    }
}
