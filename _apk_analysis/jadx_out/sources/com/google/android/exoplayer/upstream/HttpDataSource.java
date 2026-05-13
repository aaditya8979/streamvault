package com.google.android.exoplayer.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.upstream.a;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import y5.h;

/* JADX INFO: loaded from: classes8.dex */
public interface HttpDataSource extends com.google.android.exoplayer.upstream.a {

    public static class HttpDataSourceException extends IOException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final h dataSpec;
        public final int type;

        public HttpDataSourceException(IOException iOException, h hVar, int i10) {
            super(iOException);
            this.dataSpec = hVar;
            this.type = i10;
        }

        public HttpDataSourceException(String str, IOException iOException, h hVar, int i10) {
            super(str, iOException);
            this.dataSpec = hVar;
            this.type = i10;
        }

        public HttpDataSourceException(String str, h hVar, int i10) {
            super(str);
            this.dataSpec = hVar;
            this.type = i10;
        }

        public HttpDataSourceException(h hVar, int i10) {
            this.dataSpec = hVar;
            this.type = i10;
        }
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        public InvalidContentTypeException(String str, h hVar) {
            super("Invalid content type: " + str, hVar, 1);
            this.contentType = str;
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final Map<String, List<String>> headerFields;
        public final int responseCode;

        @Nullable
        public final String responseMessage;

        public InvalidResponseCodeException(int i10, @Nullable String str, Map<String, List<String>> map, h hVar) {
            super("Response code: " + i10, hVar, 1);
            this.responseCode = i10;
            this.responseMessage = str;
            this.headerFields = map;
        }

        @Deprecated
        public InvalidResponseCodeException(int i10, Map<String, List<String>> map, h hVar) {
            this(i10, null, map, hVar);
        }
    }

    public static abstract class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f21013a = new c();

        @Override // com.google.android.exoplayer.upstream.a.InterfaceC0296a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HttpDataSource createDataSource() {
            return b(this.f21013a);
        }

        public abstract HttpDataSource b(c cVar);

        @Override // com.google.android.exoplayer.upstream.HttpDataSource.b
        public final c getDefaultRequestProperties() {
            return this.f21013a;
        }
    }

    public interface b extends a.InterfaceC0296a {
        c getDefaultRequestProperties();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, String> f21014a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, String> f21015b;

        public synchronized Map<String, String> a() {
            if (this.f21015b == null) {
                this.f21015b = Collections.unmodifiableMap(new HashMap(this.f21014a));
            }
            return this.f21015b;
        }

        public synchronized void b(String str, String str2) {
            this.f21015b = null;
            this.f21014a.put(str, str2);
        }
    }
}
