package qr;

import androidx.core.app.NotificationCompat;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: Icon.java */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f78440h = Logger.getLogger(m.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final os.c f78441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f78443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f78444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final URI f78445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f78446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f78447g;

    public d(String str, int i10, int i11, int i12, URI uri) {
        this((str == null || str.length() <= 0) ? null : os.c.f(str), i10, i11, i12, uri, null);
    }

    public d(os.c cVar, int i10, int i11, int i12, URI uri, byte[] bArr) {
        this.f78441a = cVar;
        this.f78442b = i10;
        this.f78443c = i11;
        this.f78444d = i12;
        this.f78445e = uri;
        this.f78446f = bArr;
    }

    public d a() {
        return new d(f(), h(), e(), c(), g(), b());
    }

    public byte[] b() {
        return this.f78446f;
    }

    public int c() {
        return this.f78444d;
    }

    public a d() {
        return this.f78447g;
    }

    public int e() {
        return this.f78443c;
    }

    public os.c f() {
        return this.f78441a;
    }

    public URI g() {
        return this.f78445e;
    }

    public int h() {
        return this.f78442b;
    }

    public void i(a aVar) {
        if (this.f78447g != null) {
            throw new IllegalStateException("Final value has been set already, model is immutable");
        }
        this.f78447g = aVar;
    }

    public List<ir.k> j() {
        ArrayList arrayList = new ArrayList();
        if (f() == null) {
            Logger logger = f78440h;
            logger.warning("UPnP specification violation of: " + d());
            logger.warning("Invalid icon, missing mime type: " + this);
        }
        if (h() == 0) {
            Logger logger2 = f78440h;
            logger2.warning("UPnP specification violation of: " + d());
            logger2.warning("Invalid icon, missing width: " + this);
        }
        if (e() == 0) {
            Logger logger3 = f78440h;
            logger3.warning("UPnP specification violation of: " + d());
            logger3.warning("Invalid icon, missing height: " + this);
        }
        if (c() == 0) {
            Logger logger4 = f78440h;
            logger4.warning("UPnP specification violation of: " + d());
            logger4.warning("Invalid icon, missing bitmap depth: " + this);
        }
        if (g() == null) {
            arrayList.add(new ir.k(getClass(), NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "URL is required"));
        } else {
            try {
                if (g().toURL() == null) {
                    throw new MalformedURLException();
                }
            } catch (IllegalArgumentException unused) {
            } catch (MalformedURLException e10) {
                arrayList.add(new ir.k(getClass(), NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "URL must be valid: " + e10.getMessage()));
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Icon(" + h() + VastAttributes.HORIZONTAL_POSITION + e() + ", MIME: " + f() + ") " + g();
    }
}
