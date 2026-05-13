package org.fourthline.cling.model.message;

import com.ironsource.Z7;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import lr.d;

/* JADX INFO: loaded from: classes8.dex */
public class UpnpRequest extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f76838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public URI f76839c;

    public enum Method {
        GET("GET"),
        POST("POST"),
        NOTIFY("NOTIFY"),
        MSEARCH("M-SEARCH"),
        SUBSCRIBE("SUBSCRIBE"),
        UNSUBSCRIBE("UNSUBSCRIBE"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Map<String, Method> f76840b = new HashMap<String, Method>() { // from class: org.fourthline.cling.model.message.UpnpRequest.Method.1
            {
                for (Method method : Method.values()) {
                    put(method.getHttpName(), method);
                }
            }
        };
        private String httpName;

        Method(String str) {
            this.httpName = str;
        }

        public static Method getByHttpName(String str) {
            Method method;
            return (str == null || (method = f76840b.get(str.toUpperCase(Locale.ROOT))) == null) ? UNKNOWN : method;
        }

        public String getHttpName() {
            return this.httpName;
        }
    }

    public UpnpRequest(Method method) {
        this.f76838b = method;
    }

    public UpnpRequest(Method method, URI uri) {
        this.f76838b = method;
        this.f76839c = uri;
    }

    public UpnpRequest(Method method, URL url) {
        this.f76838b = method;
        if (url != null) {
            try {
                this.f76839c = url.toURI();
            } catch (URISyntaxException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
    }

    public String c() {
        return this.f76838b.getHttpName();
    }

    public Method d() {
        return this.f76838b;
    }

    public URI e() {
        return this.f76839c;
    }

    public void f(URI uri) {
        this.f76839c = uri;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c());
        if (e() != null) {
            str = Z7.f30794r + e();
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
