package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import e6.s1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: ExoMediaDrm.java */
/* JADX INFO: loaded from: classes8.dex */
public interface g {

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f21532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21534c;

        public a(byte[] bArr, String str, int i10) {
            this.f21532a = bArr;
            this.f21533b = str;
            this.f21534c = i10;
        }

        public byte[] a() {
            return this.f21532a;
        }

        public String b() {
            return this.f21533b;
        }
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface b {
        void a(g gVar, @Nullable byte[] bArr, int i10, int i11, @Nullable byte[] bArr2);
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface c {
        g acquireExoMediaDrm(UUID uuid);
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f21535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21536b;

        public d(byte[] bArr, String str) {
            this.f21535a = bArr;
            this.f21536b = str;
        }

        public byte[] a() {
            return this.f21535a;
        }

        public String b() {
            return this.f21536b;
        }
    }

    void a(@Nullable b bVar);

    default void b(byte[] bArr, s1 s1Var) {
    }

    void closeSession(byte[] bArr);

    g6.b createCryptoConfig(byte[] bArr) throws MediaCryptoException;

    int getCryptoType();

    a getKeyRequest(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i10, @Nullable HashMap<String, String> map) throws NotProvisionedException;

    d getProvisionRequest();

    byte[] openSession() throws MediaDrmException;

    @Nullable
    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void provideProvisionResponse(byte[] bArr) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] bArr);

    void release();

    boolean requiresSecureDecoder(byte[] bArr, String str);

    void restoreKeys(byte[] bArr, byte[] bArr2);
}
