package com.inmobi.media;

import com.inmobi.media.Se;
import com.ironsource.C3978d4;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zn.i f26314a = zn.n.v(408, 600);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zn.i f26315b = zn.n.v(300, 500);

    public static final CharSequence a(Map.Entry entry) throws UnsupportedEncodingException {
        tn.p.k(entry, "<destruct>");
        String str = (String) entry.getKey();
        String str2 = (String) entry.getValue();
        Charset charset = bo.c.f5639b;
        return URLEncoder.encode(str, charset.name()) + "=" + URLEncoder.encode(str2, charset.name());
    }

    public static final String a(String str, Map map) {
        StringBuilder sb2;
        tn.p.k(str, "url");
        if (map == null) {
            return str;
        }
        String strD0 = cn.f0.D0(map.entrySet(), C3978d4.j.f31381c, null, null, 0, null, new sn.l() { // from class: n9.e4
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Se.a((Map.Entry) obj);
            }
        }, 30, null);
        if (bo.d0.c0(str, "?", false, 2, null)) {
            sb2 = new StringBuilder();
            sb2.append(C3978d4.j.f31381c);
        } else {
            sb2 = new StringBuilder();
            sb2.append("?");
        }
        sb2.append(strD0);
        return str + sb2.toString();
    }
}
