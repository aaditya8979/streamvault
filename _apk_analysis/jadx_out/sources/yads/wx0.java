package yads;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yads.on0;
import yads.wx0;

/* JADX INFO: loaded from: classes11.dex */
public final class wx0 implements on0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mn0 f96553d = new mn0() { // from class: bt.ic
        @Override // yads.mn0
        public final on0 a(UUID uuid) {
            return wx0.b(uuid);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f96554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaDrm f96555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f96556c;

    public wx0(UUID uuid) {
        ni.a(uuid);
        ni.a("Use C.CLEARKEY_UUID instead", !jr.f91331b.equals(uuid));
        this.f96554a = uuid;
        MediaDrm mediaDrm = new MediaDrm(a(uuid));
        this.f96555b = mediaDrm;
        this.f96556c = 1;
        if (jr.f91333d.equals(uuid) && d()) {
            a(mediaDrm);
        }
    }

    public static UUID a(UUID uuid) {
        return (ib3.f90737a >= 27 || !jr.f91332c.equals(uuid)) ? uuid : jr.f91331b;
    }

    public static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    public static /* synthetic */ on0 b(UUID uuid) {
        try {
            return c(uuid);
        } catch (la3 unused) {
            ih1.b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new yk0();
        }
    }

    public static wx0 c(UUID uuid) throws la3 {
        try {
            return new wx0(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new la3(e10);
        } catch (Exception e11) {
            throw new la3(e11);
        }
    }

    public static boolean d() {
        return pk2.f93624f.a().equals(ib3.f90740d);
    }

    @Override // yads.on0
    public final Map a(byte[] bArr) {
        return this.f96555b.queryKeyStatus(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0244  */
    @Override // yads.on0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.kn0 a(byte[] r18, java.util.List r19, int r20, java.util.HashMap r21) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wx0.a(byte[], java.util.List, int, java.util.HashMap):yads.kn0");
    }

    @Override // yads.on0
    public final nn0 a() {
        MediaDrm.ProvisionRequest provisionRequest = this.f96555b.getProvisionRequest();
        return new nn0(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // yads.on0
    public final void a(final ad0 ad0Var) {
        this.f96555b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: bt.jc
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                this.f6106a.a(ad0Var, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    public final void a(ln0 ln0Var, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bd0 bd0Var = ((ad0) ln0Var).f87660a.f89945y;
        bd0Var.getClass();
        bd0Var.obtainMessage(i10, bArr).sendToTarget();
    }

    @Override // yads.on0
    public final void a(byte[] bArr, ye2 ye2Var) {
        if (ib3.f90737a >= 31) {
            try {
                vx0.a(this.f96555b, bArr, ye2Var);
            } catch (UnsupportedOperationException unused) {
                ih1.d("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // yads.on0
    public final void a(byte[] bArr, byte[] bArr2) {
        this.f96555b.restoreKeys(bArr, bArr2);
    }

    @Override // yads.on0
    public final boolean a(String str, byte[] bArr) {
        if (ib3.f90737a >= 31) {
            return vx0.a(this.f96555b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f96554a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // yads.on0
    public final int b() {
        return 2;
    }

    @Override // yads.on0
    public final void b(byte[] bArr) {
        this.f96555b.closeSession(bArr);
    }

    @Override // yads.on0
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (jr.f91332c.equals(this.f96554a) && ib3.f90737a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr2, bu.f88145c));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i10 != 0) {
                        sb2.append(StringUtils.COMMA);
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString(CampaignEx.JSON_KEY_AD_K).replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = sb2.toString().getBytes(bu.f88145c);
            } catch (JSONException e10) {
                ih1.b("ClearKeyUtil", ih1.a("Failed to adjust response data: ".concat(new String(bArr2, bu.f88145c)), e10));
            }
        }
        return this.f96555b.provideKeyResponse(bArr, bArr2);
    }

    @Override // yads.on0
    public final void c(byte[] bArr) throws DeniedByServerException {
        this.f96555b.provideProvisionResponse(bArr);
    }

    @Override // yads.on0
    public final byte[] c() {
        return this.f96555b.openSession();
    }

    @Override // yads.on0
    public final k20 d(byte[] bArr) {
        return new ux0(a(this.f96554a), bArr, ib3.f90737a < 21 && jr.f91333d.equals(this.f96554a) && "L3".equals(this.f96555b.getPropertyString("securityLevel")));
    }

    @Override // yads.on0
    public final synchronized void release() {
        int i10 = this.f96556c - 1;
        this.f96556c = i10;
        if (i10 == 0) {
            this.f96555b.release();
        }
    }
}
