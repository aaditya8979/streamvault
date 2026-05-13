package wp;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import me.goldze.mvvmhabit.http.cookie.store.SerializableHttpCookie;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: PersistentCookieStore.java */
/* JADX INFO: loaded from: classes9.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, ConcurrentHashMap<String, Cookie>> f86656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f86657b;

    public b(Context context) {
        Cookie cookieD;
        SharedPreferences sharedPreferences = context.getSharedPreferences("habit_cookie", 0);
        this.f86657b = sharedPreferences;
        this.f86656a = new HashMap<>();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            if (entry.getValue() != null && !entry.getKey().startsWith("cookie_")) {
                for (String str : TextUtils.split((String) entry.getValue(), StringUtils.COMMA)) {
                    String string = this.f86657b.getString("cookie_" + str, null);
                    if (string != null && (cookieD = d(string)) != null) {
                        if (!this.f86656a.containsKey(entry.getKey())) {
                            this.f86656a.put(entry.getKey(), new ConcurrentHashMap<>());
                        }
                        this.f86656a.get(entry.getKey()).put(str, cookieD);
                    }
                }
            }
        }
    }

    public static boolean h(Cookie cookie) {
        return cookie.expiresAt() < System.currentTimeMillis();
    }

    @Override // wp.a
    public List<Cookie> a(HttpUrl httpUrl) {
        ArrayList arrayList = new ArrayList();
        if (this.f86656a.containsKey(httpUrl.host())) {
            for (Cookie cookie : this.f86656a.get(httpUrl.host()).values()) {
                if (h(cookie)) {
                    i(httpUrl, cookie);
                } else {
                    arrayList.add(cookie);
                }
            }
        }
        return arrayList;
    }

    @Override // wp.a
    public void b(HttpUrl httpUrl, List<Cookie> list) {
        if (!this.f86656a.containsKey(httpUrl.host())) {
            this.f86656a.put(httpUrl.host(), new ConcurrentHashMap<>());
        }
        for (Cookie cookie : list) {
            if (h(cookie)) {
                i(httpUrl, cookie);
            } else {
                j(httpUrl, cookie, f(cookie));
            }
        }
    }

    public final String c(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            if (i10 < 16) {
                sb2.append('0');
            }
            sb2.append(Integer.toHexString(i10));
        }
        return sb2.toString().toUpperCase(Locale.US);
    }

    public final Cookie d(String str) {
        try {
            return ((SerializableHttpCookie) new ObjectInputStream(new ByteArrayInputStream(g(str))).readObject()).getCookie();
        } catch (IOException e10) {
            Log.d("PersistentCookieStore", "IOException in decodeCookie", e10);
            return null;
        } catch (ClassNotFoundException e11) {
            Log.d("PersistentCookieStore", "ClassNotFoundException in decodeCookie", e11);
            return null;
        }
    }

    public final String e(SerializableHttpCookie serializableHttpCookie) {
        if (serializableHttpCookie == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(serializableHttpCookie);
            return c(byteArrayOutputStream.toByteArray());
        } catch (IOException e10) {
            Log.d("PersistentCookieStore", "IOException in encodeCookie", e10);
            return null;
        }
    }

    public final String f(Cookie cookie) {
        return cookie.name() + "@" + cookie.domain();
    }

    public final byte[] g(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
        }
        return bArr;
    }

    public boolean i(HttpUrl httpUrl, Cookie cookie) {
        String strF = f(cookie);
        if (!this.f86656a.containsKey(httpUrl.host()) || !this.f86656a.get(httpUrl.host()).containsKey(strF)) {
            return false;
        }
        this.f86656a.get(httpUrl.host()).remove(strF);
        SharedPreferences.Editor editorEdit = this.f86657b.edit();
        if (this.f86657b.contains("cookie_" + strF)) {
            editorEdit.remove("cookie_" + strF);
        }
        editorEdit.putString(httpUrl.host(), TextUtils.join(StringUtils.COMMA, this.f86656a.get(httpUrl.host()).keySet()));
        editorEdit.apply();
        return true;
    }

    public final void j(HttpUrl httpUrl, Cookie cookie, String str) {
        this.f86656a.get(httpUrl.host()).put(str, cookie);
        SharedPreferences.Editor editorEdit = this.f86657b.edit();
        editorEdit.putString(httpUrl.host(), TextUtils.join(StringUtils.COMMA, this.f86656a.get(httpUrl.host()).keySet()));
        editorEdit.putString("cookie_" + str, e(new SerializableHttpCookie(cookie)));
        editorEdit.apply();
    }
}
