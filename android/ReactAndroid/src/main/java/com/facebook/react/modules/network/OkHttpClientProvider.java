/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */
package com.facebook.react.modules.network;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/**
 * Helper class that provides the same OkHttpClient instance that will be used for all networking
 * requests.
 */
public class OkHttpClientProvider {

    // Centralized OkHttpClient for all networking requests.
    @Nullable
    public static OkHttpClient sClient;

    // User-provided OkHttpClient factory
    @Nullable
    public static OkHttpClientFactory sFactory;

    public static void setOkHttpClientFactory(OkHttpClientFactory factory) {
        sFactory = factory;
    }

    public static OkHttpClient getOkHttpClient() {
        if (sClient == null) {
            sClient = createClient();
        }
        return sClient;
    }

    public static OkHttpClient createClient() {
        try {
            return (OkHttpClient) Class.forName("host.exp.exponent.ReactNativeStaticHelpers").getMethod("getOkHttpClient", Class.class).invoke(null, OkHttpClientProvider.class);
        } catch (Exception expoHandleErrorException) {
            expoHandleErrorException.printStackTrace();
            return null;
        }
    }

    public static OkHttpClient createClient(Context context) {
        try {
            return (OkHttpClient) Class.forName("host.exp.exponent.ReactNativeStaticHelpers").getMethod("getOkHttpClient", Class.class).invoke(null, OkHttpClientProvider.class);
        } catch (Exception expoHandleErrorException) {
            expoHandleErrorException.printStackTrace();
            return null;
        }
    }

    public static OkHttpClient.Builder createClientBuilder() {
        // No timeouts by default
        OkHttpClient.Builder client = new OkHttpClient.Builder().connectTimeout(0, TimeUnit.MILLISECONDS).readTimeout(0, TimeUnit.MILLISECONDS).writeTimeout(0, TimeUnit.MILLISECONDS).cookieJar(new ReactCookieJarContainer());
        return client;
    }

    public static OkHttpClient.Builder createClientBuilder(Context context) {
        // 10 Mo
        int cacheSize = 10 * 1024 * 1024;
        return createClientBuilder(context, cacheSize);
    }

    public static OkHttpClient.Builder createClientBuilder(Context context, int cacheSize) {
        OkHttpClient.Builder client = createClientBuilder();
        if (cacheSize == 0) {
            return client;
        }
        File cacheDirectory = new File(context.getCacheDir(), "http-cache");
        Cache cache = new Cache(cacheDirectory, cacheSize);
        return client.cache(cache);
    }
}
