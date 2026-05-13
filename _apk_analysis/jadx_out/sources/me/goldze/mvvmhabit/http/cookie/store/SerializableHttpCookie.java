package me.goldze.mvvmhabit.http.cookie.store;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import okhttp3.Cookie;

/* JADX INFO: loaded from: classes10.dex */
public class SerializableHttpCookie implements Serializable {
    private static final long serialVersionUID = 6374381323722046732L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient Cookie f74191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Cookie f74192c;

    public SerializableHttpCookie(Cookie cookie) {
        this.f74191b = cookie;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        String str = (String) objectInputStream.readObject();
        String str2 = (String) objectInputStream.readObject();
        long j10 = objectInputStream.readLong();
        String str3 = (String) objectInputStream.readObject();
        String str4 = (String) objectInputStream.readObject();
        boolean z10 = objectInputStream.readBoolean();
        boolean z11 = objectInputStream.readBoolean();
        boolean z12 = objectInputStream.readBoolean();
        objectInputStream.readBoolean();
        Cookie.Builder builderExpiresAt = new Cookie.Builder().name(str).value(str2).expiresAt(j10);
        Cookie.Builder builderPath = (z12 ? builderExpiresAt.hostOnlyDomain(str3) : builderExpiresAt.domain(str3)).path(str4);
        if (z10) {
            builderPath = builderPath.secure();
        }
        if (z11) {
            builderPath = builderPath.httpOnly();
        }
        this.f74192c = builderPath.build();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f74191b.name());
        objectOutputStream.writeObject(this.f74191b.value());
        objectOutputStream.writeLong(this.f74191b.expiresAt());
        objectOutputStream.writeObject(this.f74191b.domain());
        objectOutputStream.writeObject(this.f74191b.path());
        objectOutputStream.writeBoolean(this.f74191b.secure());
        objectOutputStream.writeBoolean(this.f74191b.httpOnly());
        objectOutputStream.writeBoolean(this.f74191b.hostOnly());
        objectOutputStream.writeBoolean(this.f74191b.persistent());
    }

    public Cookie getCookie() {
        Cookie cookie = this.f74191b;
        Cookie cookie2 = this.f74192c;
        return cookie2 != null ? cookie2 : cookie;
    }
}
