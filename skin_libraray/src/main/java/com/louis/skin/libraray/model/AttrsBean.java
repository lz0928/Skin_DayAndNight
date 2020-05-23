package com.louis.skin.libraray.model;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

public class AttrsBean {
    private SparseIntArray resourceMap;
    public static final int DEFAULT_VALUE = -1;

    public AttrsBean(){
        resourceMap = new SparseIntArray();
    }

    public void saveViewResource(TypedArray typedArray, int[] styleable) {
        for (int i = 0; i < typedArray.length(); i++) {
            int key = styleable[i];
            int resourceId = typedArray.getResourceId(i, DEFAULT_VALUE);
            resourceMap.put(key,resourceId);
        }
    }

    public int getViewResource(int styleable) {
        return resourceMap.get(styleable);
    }
}
