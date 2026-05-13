package io.bidmachine.rendering.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.ironsource.Z7;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.utils.taskmanager.CancelableTask;
import io.bidmachine.util.network.NetworkUtils;
import io.bidmachine.util.taskmanager.TaskManager;
import io.bidmachine.util.taskmanager.coroutine.NetworkTaskManager;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class NetworkRequest<ResponseType> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final TaskManager f70936m = new NetworkTaskManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f70937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f70938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f70939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f70940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f70941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Integer f70942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final UrlConnectionProcessor f70943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final DataRetriever f70944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ResponseProcessor f70945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Listener f70946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TaskManager f70947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CancelableTask f70948l;

    public static class Builder<ResponseType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f70949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f70950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f70951c = new HashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f70952d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f70953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f70954f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private UrlConnectionProcessor f70955g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private DataRetriever f70956h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ResponseProcessor f70957i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Listener f70958j;

        public Builder(@NonNull String str, @NonNull Method method) {
            this.f70949a = str;
            this.f70950b = method;
        }

        public Builder<ResponseType> addHeader(@NonNull String str, @NonNull String str2) {
            this.f70951c.put(str, str2);
            return this;
        }

        public Builder<ResponseType> addQueryParameter(@NonNull String str, @NonNull String str2) {
            this.f70952d.put(str, str2);
            return this;
        }

        @NonNull
        public NetworkRequest<ResponseType> build() {
            return new NetworkRequest<>(this.f70949a, this.f70950b, this.f70951c, this.f70952d, this.f70953e, this.f70954f, this.f70955g, this.f70956h, this.f70957i, this.f70958j);
        }

        @NonNull
        public NetworkRequest<ResponseType> send() {
            NetworkRequest<ResponseType> networkRequestBuild = build();
            networkRequestBuild.send();
            return networkRequestBuild;
        }

        public Builder<ResponseType> setConnectTimeout(@Nullable Integer num) {
            this.f70953e = num;
            return this;
        }

        public Builder<ResponseType> setHeaders(@Nullable Map<String, String> map) {
            Utils.set(this.f70951c, map);
            return this;
        }

        public Builder<ResponseType> setListener(@Nullable Listener<ResponseType> listener) {
            this.f70958j = listener;
            return this;
        }

        public Builder<ResponseType> setQueryParameters(@Nullable Map<String, String> map) {
            Utils.set(this.f70952d, map);
            return this;
        }

        public Builder<ResponseType> setReadTimeout(@Nullable Integer num) {
            this.f70954f = num;
            return this;
        }

        public Builder<ResponseType> setRequestDataRetriever(@Nullable DataRetriever dataRetriever) {
            this.f70956h = dataRetriever;
            return this;
        }

        public Builder<ResponseType> setResponseTransformer(@Nullable ResponseProcessor<ResponseType> responseProcessor) {
            this.f70957i = responseProcessor;
            return this;
        }

        public Builder<ResponseType> setUrlConnectionProcessor(@Nullable UrlConnectionProcessor urlConnectionProcessor) {
            this.f70955g = urlConnectionProcessor;
            return this;
        }

        public Builder<ResponseType> setUserAgent(@Nullable String str) {
            if (!TextUtils.isEmpty(str)) {
                addHeader("User-Agent", str);
            }
            return this;
        }
    }

    public static abstract class ByteArrayProcessor<T> implements ResponseProcessor<T>, ResponseTransformer<byte[], T> {
        @Override // io.bidmachine.rendering.utils.NetworkRequest.ResponseProcessor
        @Nullable
        public T process(@NonNull URLConnection uRLConnection) throws Throwable {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            InputStream inputStream2 = null;
            try {
                inputStream = uRLConnection.getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Throwable th2) {
                    inputStream2 = inputStream;
                    th = th2;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
            try {
                Utils.write(inputStream, byteArrayOutputStream);
                T tTransform = transform(byteArrayOutputStream.toByteArray());
                io.bidmachine.util.Utils.flushSafely(byteArrayOutputStream);
                io.bidmachine.util.Utils.closeSafely(byteArrayOutputStream);
                io.bidmachine.util.Utils.closeSafely(inputStream);
                return tTransform;
            } catch (Throwable th4) {
                inputStream2 = inputStream;
                th = th4;
                io.bidmachine.util.Utils.flushSafely(byteArrayOutputStream);
                io.bidmachine.util.Utils.closeSafely(byteArrayOutputStream);
                io.bidmachine.util.Utils.closeSafely(inputStream2);
                throw th;
            }
        }

        @Override // io.bidmachine.rendering.utils.NetworkRequest.ResponseTransformer
        @Nullable
        public abstract /* synthetic */ Object transform(@NonNull Object obj);
    }

    public interface DataRetriever {
        @Nullable
        @WorkerThread
        byte[] retrieve();
    }

    public static abstract class FileOutputStreamProcessor<T> implements ResponseProcessor<T>, ResponseTransformer<File, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f70959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final File f70960b;

        public FileOutputStreamProcessor(@NonNull Context context, @NonNull File file) {
            this.f70959a = context.getApplicationContext();
            this.f70960b = file;
        }

        @Override // io.bidmachine.rendering.utils.NetworkRequest.ResponseProcessor
        @Nullable
        public T process(@NonNull URLConnection uRLConnection) throws Throwable {
            FileOutputStream fileOutputStream;
            File externalDir = io.bidmachine.util.file.FileUtils.getExternalDir(this.f70959a);
            if (externalDir == null) {
                throw new IllegalStateException("Can't get external dir");
            }
            File fileCreateTempFile = io.bidmachine.util.file.FileUtils.createTempFile(externalDir);
            long contentLength = uRLConnection.getContentLength();
            InputStream inputStream = null;
            try {
                InputStream inputStream2 = uRLConnection.getInputStream();
                try {
                    fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    try {
                        long jWrite = Utils.write(inputStream2, fileOutputStream);
                        io.bidmachine.util.Utils.flushSafely(fileOutputStream);
                        io.bidmachine.util.Utils.closeSafely(fileOutputStream);
                        io.bidmachine.util.Utils.closeSafely(inputStream2);
                        if (contentLength != jWrite) {
                            io.bidmachine.util.file.FileUtils.deleteFile(fileCreateTempFile);
                            throw new IllegalStateException("The downloaded file size does not match the stated size");
                        }
                        if (!io.bidmachine.util.file.FileUtils.renameToSafely(fileCreateTempFile, this.f70960b)) {
                            io.bidmachine.util.file.FileUtils.deleteFile(fileCreateTempFile);
                            if (!io.bidmachine.util.file.FileUtils.hasContent(this.f70960b)) {
                                throw new IllegalStateException("Can't rename temp file");
                            }
                        }
                        return transform(this.f70960b);
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        io.bidmachine.util.Utils.flushSafely(fileOutputStream);
                        io.bidmachine.util.Utils.closeSafely(fileOutputStream);
                        io.bidmachine.util.Utils.closeSafely(inputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        }

        @Nullable
        public abstract /* synthetic */ Object transform(@NonNull Object obj);
    }

    public interface Listener<ResponseType> {
        void onError(@NonNull Error error);

        void onSuccess(@Nullable ResponseType responsetype);
    }

    public enum Method {
        Get("GET"),
        Post("POST");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f70962a;

        Method(@NonNull String str) {
            this.f70962a = str;
        }

        public String getNetworkName() {
            return this.f70962a;
        }
    }

    public interface ResponseProcessor<ResponseType> {
        @Nullable
        ResponseType process(@NonNull URLConnection uRLConnection);
    }

    public interface ResponseTransformer<From, To> {
        @Nullable
        To transform(@NonNull From from);
    }

    public static class StringProcessor extends ByteArrayProcessor<String> {
        @Override // io.bidmachine.rendering.utils.NetworkRequest.ByteArrayProcessor, io.bidmachine.rendering.utils.NetworkRequest.ResponseTransformer
        @Nullable
        public String transform(@NonNull byte[] bArr) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
    }

    public interface UrlConnectionProcessor {
        void process(@NonNull URLConnection uRLConnection);
    }

    public class b extends CancelableTask {
        private b() {
        }

        @Override // io.bidmachine.rendering.utils.taskmanager.CancelableTask
        public void runTask() {
            NetworkRequest.this.b();
        }
    }

    public NetworkRequest(@NonNull String str, @NonNull Method method, @NonNull Map<String, String> map, @NonNull Map<String, String> map2, @Nullable Integer num, @Nullable Integer num2, @Nullable UrlConnectionProcessor urlConnectionProcessor, @Nullable DataRetriever dataRetriever, @Nullable ResponseProcessor<ResponseType> responseProcessor, @Nullable Listener<ResponseType> listener) {
        this.f70937a = str;
        this.f70938b = method;
        this.f70941e = num;
        this.f70942f = num2;
        this.f70945i = responseProcessor;
        this.f70939c = map;
        this.f70940d = map2;
        this.f70943g = urlConnectionProcessor;
        this.f70944h = dataRetriever;
        this.f70946j = listener;
    }

    private String a(String str, Map map) {
        if (map.isEmpty()) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    private HttpURLConnection a(String str) throws Throwable {
        HttpURLConnection httpURLConnection;
        byte[] bArrRetrieve;
        URL url = new URL(str);
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod(this.f70938b.getNetworkName());
            for (Map.Entry entry : this.f70939c.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            UrlConnectionProcessor urlConnectionProcessor = this.f70943g;
            if (urlConnectionProcessor != null) {
                urlConnectionProcessor.process(httpURLConnection);
            }
            Integer num = this.f70941e;
            if (num != null && num.intValue() >= 0) {
                httpURLConnection.setConnectTimeout(this.f70941e.intValue());
            }
            Integer num2 = this.f70942f;
            if (num2 != null && num2.intValue() >= 0) {
                httpURLConnection.setReadTimeout(this.f70942f.intValue());
            }
            DataRetriever dataRetriever = this.f70944h;
            if (dataRetriever != null && (bArrRetrieve = dataRetriever.retrieve()) != null) {
                a(httpURLConnection, bArrRetrieve);
            }
            switch (httpURLConnection.getResponseCode()) {
                case 301:
                case 302:
                case 303:
                case 305:
                case 307:
                case 308:
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField) && io.bidmachine.util.Utils.isHttpUrl(headerField)) {
                        NetworkUtils.disconnectSafely(httpURLConnection);
                        return a(headerField);
                    }
                    return httpURLConnection;
                case 304:
                case 306:
                default:
                    return httpURLConnection;
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            NetworkUtils.disconnectSafely(httpURLConnection2);
            throw th;
        }
    }

    private void a() {
        this.f70947k = null;
        this.f70948l = null;
    }

    private void a(Error error) {
        Listener listener = this.f70946j;
        if (listener != null) {
            listener.onError(error);
        }
    }

    private void a(Object obj) {
        Listener listener = this.f70946j;
        if (listener != null) {
            listener.onSuccess(obj);
        }
    }

    private void a(URLConnection uRLConnection, byte[] bArr) throws Throwable {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(uRLConnection.getOutputStream());
            try {
                bufferedOutputStream2.write(bArr);
                io.bidmachine.iab.utils.Utils.flush(bufferedOutputStream2);
                io.bidmachine.iab.utils.Utils.close(bufferedOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = bufferedOutputStream2;
                io.bidmachine.iab.utils.Utils.flush(bufferedOutputStream);
                io.bidmachine.iab.utils.Utils.close(bufferedOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        HttpURLConnection httpURLConnectionA;
        Throwable th2;
        Error error;
        try {
            httpURLConnectionA = a(a(this.f70937a, this.f70940d));
            try {
                int responseCode = httpURLConnectionA.getResponseCode();
                if (responseCode == 200) {
                    ResponseProcessor responseProcessor = this.f70945i;
                    if (responseProcessor == null) {
                        a((Object) null);
                        return;
                    }
                    try {
                        a(responseProcessor.process(httpURLConnectionA));
                    } catch (Throwable th3) {
                        error = Error.create(th3);
                        a(error);
                    }
                } else if (responseCode == 204) {
                    a((Object) null);
                } else {
                    error = new Error("Server response code - " + responseCode + Z7.f30794r + httpURLConnectionA.getResponseMessage());
                    a(error);
                }
            } catch (Throwable th4) {
                th2 = th4;
                try {
                    a(Error.create(th2));
                } finally {
                    NetworkUtils.disconnectSafely(httpURLConnectionA);
                }
            }
        } catch (Throwable th5) {
            httpURLConnectionA = null;
            th2 = th5;
        }
    }

    public void cancel() {
        TaskManager taskManager = this.f70947k;
        CancelableTask cancelableTask = this.f70948l;
        if (taskManager != null && cancelableTask != null) {
            taskManager.cancel(cancelableTask);
        }
        a();
    }

    public void send() {
        send(f70936m);
    }

    public void send(@NonNull TaskManager taskManager) {
        cancel();
        this.f70947k = taskManager;
        b bVar = new b();
        this.f70948l = bVar;
        try {
            taskManager.execute(bVar);
        } catch (Throwable th2) {
            a(Error.create(th2));
        }
    }
}
