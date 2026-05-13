package com.applovin.shadow.okhttp3.internal.tls;

import bo.a0;
import bo.d0;
import cn.f0;
import cn.w;
import com.applovin.shadow.okhttp3.internal.HostnamesKt;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.Utf8;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: OkHostnameVerifier.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;

    @NotNull
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale locale = Locale.US;
        p.j(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        p.j(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return w.m();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && p.f(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return w.m();
        }
    }

    private final boolean isAscii(String str) {
        return str.length() == ((int) Utf8.size$default(str, 0, 0, 3, null));
    }

    private final boolean verifyHostname(String str, String str2) {
        String str3;
        String str4 = str;
        if ((str4 == null || str.length() == 0) || a0.W(str4, ".", false, 2, null) || a0.I(str4, "..", false, 2, null)) {
            return false;
        }
        if ((str2 == null || str2.length() == 0) || a0.W(str2, ".", false, 2, null) || a0.I(str2, "..", false, 2, null)) {
            return false;
        }
        if (!a0.I(str4, ".", false, 2, null)) {
            str4 = str4 + '.';
        }
        String str5 = str4;
        if (a0.I(str2, ".", false, 2, null)) {
            str3 = str2;
        } else {
            str3 = str2 + '.';
        }
        String strAsciiToLowercase = asciiToLowercase(str3);
        if (!d0.c0(strAsciiToLowercase, "*", false, 2, null)) {
            return p.f(str5, strAsciiToLowercase);
        }
        if (!a0.W(strAsciiToLowercase, "*.", false, 2, null) || d0.q0(strAsciiToLowercase, '*', 1, false, 4, null) != -1 || str5.length() < strAsciiToLowercase.length() || p.f("*.", strAsciiToLowercase)) {
            return false;
        }
        String strSubstring = strAsciiToLowercase.substring(1);
        p.j(strSubstring, "this as java.lang.String).substring(startIndex)");
        if (!a0.I(str5, strSubstring, false, 2, null)) {
            return false;
        }
        int length = str5.length() - strSubstring.length();
        return length <= 0 || d0.x0(str5, '.', length + (-1), false, 4, null) == -1;
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String strAsciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(strAsciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (p.f(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List<String> allSubjectAltNames(@NotNull X509Certificate x509Certificate) {
        p.k(x509Certificate, "certificate");
        return f0.O0(getSubjectAltNames(x509Certificate, 7), getSubjectAltNames(x509Certificate, 2));
    }

    public final boolean verify(@NotNull String str, @NotNull X509Certificate x509Certificate) {
        p.k(str, "host");
        p.k(x509Certificate, "certificate");
        return Util.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@NotNull String str, @NotNull SSLSession sSLSession) {
        p.k(str, "host");
        p.k(sSLSession, "session");
        if (!isAscii(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            p.i(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return verify(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
