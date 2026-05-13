package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrm$PlaybackComponent;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.g;
import e6.s1;
import h6.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import q6.l;
import s7.a0;
import s7.m0;
import s7.q;

/* JADX INFO: compiled from: FrameworkMediaDrm.java */
/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(18)
public final class h implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g.c f21537d = new g.c() { // from class: h6.s
        @Override // com.google.android.exoplayer2.drm.g.c
        public final com.google.android.exoplayer2.drm.g acquireExoMediaDrm(UUID uuid) {
            return com.google.android.exoplayer2.drm.h.p(uuid);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f21538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaDrm f21539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21540c;

    /* JADX INFO: compiled from: FrameworkMediaDrm.java */
    @RequiresApi(31)
    public static class a {
        @DoNotInline
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        @DoNotInline
        public static void b(MediaDrm mediaDrm, byte[] bArr, s1 s1Var) {
            LogSessionId logSessionIdA = s1Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            ((MediaDrm$PlaybackComponent) s7.a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdA);
        }
    }

    public h(UUID uuid) throws UnsupportedSchemeException {
        s7.a.e(uuid);
        s7.a.b(!d6.c.f59582b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f21538a = uuid;
        MediaDrm mediaDrm = new MediaDrm(j(uuid));
        this.f21539b = mediaDrm;
        this.f21540c = 1;
        if (d6.c.f59584d.equals(uuid) && q()) {
            l(mediaDrm);
        }
    }

    public static byte[] e(byte[] bArr) {
        a0 a0Var = new a0(bArr);
        int iQ = a0Var.q();
        short s10 = a0Var.s();
        short s11 = a0Var.s();
        if (s10 != 1 || s11 != 1) {
            q.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short s12 = a0Var.s();
        Charset charset = y7.c.f87339e;
        String strB = a0Var.B(s12, charset);
        if (strB.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strB.indexOf("</DATA>");
        if (iIndexOf == -1) {
            q.i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strB.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strB.substring(iIndexOf);
        int i10 = iQ + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i10);
        byteBufferAllocate.putShort(s10);
        byteBufferAllocate.putShort(s11);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    public static String f(String str) {
        return "<LA_URL>https://x</LA_URL>".equals(str) ? "" : (m0.f79487a == 33 && "https://default.url".equals(str)) ? "" : str;
    }

    public static byte[] g(UUID uuid, byte[] bArr) {
        return d6.c.f59583c.equals(uuid) ? h6.a.a(bArr) : bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] h(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = d6.c.f59585e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = q6.l.e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = e(r4)
            byte[] r4 = q6.l.a(r0, r4)
        L18:
            int r1 = s7.m0.f79487a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = d6.c.f59584d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = s7.m0.f79489c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = s7.m0.f79490d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = q6.l.e(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.h.h(java.util.UUID, byte[]):byte[]");
    }

    public static String i(UUID uuid, String str) {
        return (m0.f79487a < 26 && d6.c.f59583c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    public static UUID j(UUID uuid) {
        return (m0.f79487a >= 27 || !d6.c.f59583c.equals(uuid)) ? uuid : d6.c.f59582b;
    }

    public static void l(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    public static DrmInitData.SchemeData n(UUID uuid, List<DrmInitData.SchemeData> list) {
        boolean z10;
        if (!d6.c.f59584d.equals(uuid)) {
            return list.get(0);
        }
        if (m0.f79487a >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = list.get(0);
            int length = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                DrmInitData.SchemeData schemeData2 = list.get(i10);
                byte[] bArr = (byte[]) s7.a.e(schemeData2.f21517f);
                if (!m0.c(schemeData2.f21516e, schemeData.f21516e) || !m0.c(schemeData2.f21515d, schemeData.f21515d) || !l.c(bArr)) {
                    z10 = false;
                    break;
                }
                length += bArr.length;
            }
            z10 = true;
            if (z10) {
                byte[] bArr2 = new byte[length];
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    byte[] bArr3 = (byte[]) s7.a.e(list.get(i12).f21517f);
                    int length2 = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i11, length2);
                    i11 += length2;
                }
                return schemeData.b(bArr2);
            }
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            DrmInitData.SchemeData schemeData3 = list.get(i13);
            int iG = l.g((byte[]) s7.a.e(schemeData3.f21517f));
            int i14 = m0.f79487a;
            if (i14 < 23 && iG == 0) {
                return schemeData3;
            }
            if (i14 >= 23 && iG == 1) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(g.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.a(this, bArr, i10, i11, bArr2);
    }

    public static /* synthetic */ g p(UUID uuid) {
        try {
            return r(uuid);
        } catch (UnsupportedDrmException unused) {
            q.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new e();
        }
    }

    public static boolean q() {
        return "ASUS_Z00AD".equals(m0.f79490d);
    }

    public static h r(UUID uuid) throws UnsupportedDrmException {
        try {
            return new h(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new UnsupportedDrmException(1, e10);
        } catch (Exception e11) {
            throw new UnsupportedDrmException(2, e11);
        }
    }

    @Override // com.google.android.exoplayer2.drm.g
    public void a(@Nullable final g.b bVar) {
        this.f21539b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: h6.t
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                this.f63009a.o(bVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.g
    public void b(byte[] bArr, s1 s1Var) {
        if (m0.f79487a >= 31) {
            try {
                a.b(this.f21539b, bArr, s1Var);
            } catch (UnsupportedOperationException unused) {
                q.i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.g
    public void closeSession(byte[] bArr) {
        this.f21539b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public int getCryptoType() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.g
    @SuppressLint({"WrongConstant"})
    public g.a getKeyRequest(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i10, @Nullable HashMap<String, String> map) throws NotProvisionedException {
        byte[] bArrH;
        String strI;
        DrmInitData.SchemeData schemeDataN = null;
        if (list != null) {
            schemeDataN = n(this.f21538a, list);
            bArrH = h(this.f21538a, (byte[]) s7.a.e(schemeDataN.f21517f));
            strI = i(this.f21538a, schemeDataN.f21516e);
        } else {
            bArrH = null;
            strI = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f21539b.getKeyRequest(bArr, bArrH, strI, i10, map);
        byte[] bArrG = g(this.f21538a, keyRequest.getData());
        String strF = f(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strF) && schemeDataN != null && !TextUtils.isEmpty(schemeDataN.f21515d)) {
            strF = schemeDataN.f21515d;
        }
        return new g.a(bArrG, strF, m0.f79487a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public g.d getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.f21539b.getProvisionRequest();
        return new g.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.g
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public r createCryptoConfig(byte[] bArr) throws MediaCryptoException {
        return new r(j(this.f21538a), bArr, m0.f79487a < 21 && d6.c.f59584d.equals(this.f21538a) && "L3".equals(m("securityLevel")));
    }

    public String m(String str) {
        return this.f21539b.getPropertyString(str);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public byte[] openSession() throws MediaDrmException {
        return this.f21539b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.g
    @Nullable
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (d6.c.f59583c.equals(this.f21538a)) {
            bArr2 = h6.a.b(bArr2);
        }
        return this.f21539b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.f21539b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        return this.f21539b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public synchronized void release() {
        int i10 = this.f21540c - 1;
        this.f21540c = i10;
        if (i10 == 0) {
            this.f21539b.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.g
    public boolean requiresSecureDecoder(byte[] bArr, String str) {
        if (m0.f79487a >= 31) {
            return a.a(this.f21539b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f21538a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.g
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.f21539b.restoreKeys(bArr, bArr2);
    }
}
