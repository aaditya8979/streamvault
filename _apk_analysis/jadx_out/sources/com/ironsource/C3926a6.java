package com.ironsource;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.Y5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C3926a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4086j5 f30917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Z5 f30918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ob f30919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B7 f30920e = Lb.U().i();

    /* JADX INFO: renamed from: com.ironsource.a6$a */
    public class a implements Oc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Oc f30921a;

        /* JADX INFO: renamed from: com.ironsource.a6$a$a, reason: collision with other inner class name */
        public class C0369a extends JSONObject {
            public C0369a() throws JSONException {
                put(Y5.d.f30733b, System.currentTimeMillis());
            }
        }

        public a(Oc oc2) {
            this.f30921a = oc2;
        }

        @Override // com.ironsource.Oc
        public void a(C8 c82) {
            this.f30921a.a(c82);
            try {
                C3926a6.this.f30919d.a(c82.getName(), SafeIronSourceIronsourceBridge.com_ironsource_a6$a$a_jsonObjectInit(this));
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @Override // com.ironsource.Oc
        public void a(C8 c82, C4283u8 c4283u8) {
            this.f30921a.a(c82, c4283u8);
        }
    }

    public C3926a6(Context context, C4086j5 c4086j5, Z5 z52, Ob ob2) {
        this.f30916a = context;
        this.f30917b = c4086j5;
        this.f30918c = z52;
        this.f30919d = ob2;
    }

    public void a(C8 c82) throws Exception {
        if (c82.exists()) {
            if (!c82.delete()) {
                throw new Exception(Y5.a.f30713e);
            }
            this.f30919d.a(c82.getName());
        }
    }

    public void a(C8 c82, String str, int i10, int i11, Oc oc2) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception(Y5.a.f30709a);
        }
        if (this.f30920e.a(this.f30917b.a()) <= 0) {
            throw new Exception(C4014f4.A);
        }
        if (!Z3.h(this.f30916a)) {
            throw new Exception(C4014f4.C);
        }
        this.f30918c.a(c82.getPath(), new a(oc2));
        if (!c82.exists()) {
            this.f30917b.a(c82, str, i10, i11, this.f30918c);
            return;
        }
        Message message = new Message();
        message.obj = c82;
        message.what = 1015;
        this.f30918c.sendMessage(message);
    }

    public void a(C8 c82, JSONObject jSONObject) throws Exception {
        if (jSONObject == null) {
            throw new Exception(Y5.a.f30715g);
        }
        if (!c82.exists()) {
            throw new Exception(Y5.a.f30711c);
        }
        if (!this.f30919d.b(c82.getName(), jSONObject)) {
            throw new Exception(Y5.a.f30716h);
        }
    }

    public void b(C8 c82) throws Exception {
        if (c82.exists()) {
            ArrayList<C8> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(c82);
            if (!IronSourceStorageUtils.deleteFolderContentRecursive(c82) || !c82.delete()) {
                throw new Exception(Y5.a.f30714f);
            }
            this.f30919d.a(filesInFolderRecursive);
        }
    }

    public JSONObject c(C8 c82) throws Exception {
        if (c82.exists()) {
            return IronSourceStorageUtils.buildFilesMapOfDirectory(c82, this.f30919d.b());
        }
        throw new Exception(Y5.a.f30712d);
    }

    public long d(C8 c82) throws Exception {
        if (c82.exists()) {
            return IronSourceStorageUtils.getTotalSizeOfDir(c82);
        }
        throw new Exception(Y5.a.f30712d);
    }
}
