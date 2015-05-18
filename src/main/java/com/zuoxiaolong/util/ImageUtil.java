package com.zuoxiaolong.util;

import com.zuoxiaolong.config.Configuration;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author 左潇龙
 * @since 5/18/2015 2:33 PM
 */
public abstract class ImageUtil {

    private static final String BASE_PATH = "resources/img/";

    private static List<String> articleImages;

    public static void loadArticleImages (){
        articleImages = getAllActicleImages();
    }

    public static String randomArticleImage() {
        return articleImages.get(new Random().nextInt(articleImages.size()));
    }

    static {
        articleImages = getAllActicleImages();
    }

    private static List<String> getAllActicleImages() {
        File imageDir = new File(Configuration.getContextPath(BASE_PATH));
        File[] articleImages = imageDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().startsWith("article_") && pathname.getName().endsWith(".jpg")) {
                    return true;
                }
                return false;
            }
        });
        List<String> nameList = new ArrayList<>();
        if (articleImages != null ) {
            for (int i = 0 ; i < articleImages.length ; i++) {
                nameList.add(BASE_PATH + articleImages[i].getName());
            }
        }
        return nameList;
    }

}