package com.evozon.SimpleMvc.interfaces;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

/**
 * Created by leeroy on 12.07.2017.
 */
public interface Parser<T> {
    public List<T> parse(String filePath) throws IOException, ParseException;
}
