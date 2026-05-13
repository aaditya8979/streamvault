package org.fourthline.cling.model.message;

import com.ironsource.G5;
import java.io.UnsupportedEncodingException;
import lr.d;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: loaded from: classes11.dex */
public abstract class UpnpMessage<O extends d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f76831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f76832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O f76833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lr.c f76834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f76835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BodyType f76836f;

    public enum BodyType {
        STRING,
        BYTES
    }

    public UpnpMessage(O o10) {
        this.f76831a = 1;
        this.f76832b = 0;
        this.f76834d = new lr.c();
        this.f76836f = BodyType.STRING;
        this.f76833c = o10;
    }

    public UpnpMessage(O o10, BodyType bodyType, Object obj) {
        this.f76831a = 1;
        this.f76832b = 0;
        this.f76834d = new lr.c();
        BodyType bodyType2 = BodyType.STRING;
        this.f76833c = o10;
        this.f76836f = bodyType;
        this.f76835e = obj;
    }

    public UpnpMessage(UpnpMessage<O> upnpMessage) {
        this.f76831a = 1;
        this.f76832b = 0;
        this.f76834d = new lr.c();
        this.f76836f = BodyType.STRING;
        this.f76833c = (O) upnpMessage.k();
        this.f76834d = upnpMessage.j();
        this.f76835e = upnpMessage.e();
        this.f76836f = upnpMessage.g();
        this.f76831a = upnpMessage.l();
        this.f76832b = upnpMessage.m();
    }

    public void b(String str) {
        this.f76836f = BodyType.STRING;
        this.f76835e = str;
    }

    public boolean c() {
        return n() && g().equals(BodyType.STRING) && d().length() > 0;
    }

    public String d() {
        try {
            if (!n()) {
                return null;
            }
            if (!g().equals(BodyType.STRING)) {
                return new String((byte[]) e(), "UTF-8");
            }
            String str = (String) e();
            return str.charAt(0) == 65279 ? str.substring(1) : str;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public Object e() {
        return this.f76835e;
    }

    public byte[] f() {
        try {
            if (n()) {
                return g().equals(BodyType.STRING) ? d().getBytes() : (byte[]) e();
            }
            return null;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public BodyType g() {
        return this.f76836f;
    }

    public String h() {
        pr.d dVarI = i();
        if (dVarI != null) {
            return dVarI.b().b().get(G5.M);
        }
        return null;
    }

    public pr.d i() {
        return (pr.d) j().s(UpnpHeader.Type.CONTENT_TYPE, pr.d.class);
    }

    public lr.c j() {
        return this.f76834d;
    }

    public O k() {
        return this.f76833c;
    }

    public int l() {
        return this.f76831a;
    }

    public int m() {
        return this.f76832b;
    }

    public boolean n() {
        return e() != null;
    }

    public boolean o() {
        return j().r(UpnpHeader.Type.HOST) != null;
    }

    public boolean p() {
        pr.d dVarI = i();
        return dVarI == null || dVarI.f();
    }

    public boolean q() {
        pr.d dVarI = i();
        return dVarI != null && dVarI.g();
    }

    public void r(BodyType bodyType, Object obj) {
        this.f76836f = bodyType;
        this.f76835e = obj;
    }

    public void s(byte[] bArr) throws UnsupportedEncodingException {
        r(BodyType.STRING, new String(bArr, h() != null ? h() : "UTF-8"));
    }

    public void t(lr.c cVar) {
        this.f76834d = cVar;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") " + k().toString();
    }
}
