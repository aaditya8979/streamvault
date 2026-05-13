package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5190vh implements UnderlyingNetworkTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f67836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f67837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4956m7 f67838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4907k9 f67839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M6 f67840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f67841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f67842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f67843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f67844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C5165uh f67845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C4643a3 f67846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PublicLogger f67847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yo f67848m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Sa f67849n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C4657ah f67850o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FullUrlFormer f67851p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C5284zb f67852q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RequestDataHolder f67853r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ResponseDataHolder f67854s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SendingDataTaskHelper f67855t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f67856u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f67857v;

    public C5190vh(Y4 y42, C4657ah c4657ah, C5284zb c5284zb, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, M6 m62, PublicLogger publicLogger, yo yoVar, RequestBodyEncrypter requestBodyEncrypter) {
        this(y42, publicLogger, m62, c4657ah, yoVar, c5284zb, new C4643a3(1024000, "event value in ReportTask", publicLogger), AbstractC5249y1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public C5190vh(@NonNull Y4 y42, @NonNull C4657ah c4657ah, @NonNull C5284zb c5284zb, @NonNull FullUrlFormer<C4941lh> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(y42, c4657ah, c5284zb, fullUrlFormer, requestDataHolder, responseDataHolder, y42.i(), y42.p(), y42.u(), requestBodyEncrypter);
    }

    public C5190vh(Y4 y42, PublicLogger publicLogger, M6 m62, C4657ah c4657ah, yo yoVar, C5284zb c5284zb, C4643a3 c4643a3, Rj rj2, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.f67837b = new LinkedHashMap();
        this.f67842g = 0;
        this.f67843h = 0;
        this.f67844i = -1;
        this.f67857v = false;
        this.f67855t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.f67850o = c4657ah;
        this.f67836a = y42;
        this.f67840e = m62;
        this.f67847l = publicLogger;
        this.f67846k = c4643a3;
        this.f67848m = yoVar;
        this.f67852q = c5284zb;
        this.f67849n = rj2;
        this.f67853r = requestDataHolder;
        this.f67854s = responseDataHolder;
        this.f67851p = fullUrlFormer;
    }

    public static C4847i0 a(ContentValues contentValues) {
        C4776f7 model = new C4802g7(null, 1, null).toModel(contentValues);
        return new C4847i0((String) WrapUtils.getOrDefault(model.f66736g.f66660g, ""), ((Long) WrapUtils.getOrDefault(model.f66736g.f66661h, 0L)).longValue());
    }

    public static Z8[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        Z8[] z8Arr = new Z8[length];
        Iterator<String> itKeys = jSONObject.keys();
        int i10 = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Z8 z82 = new Z8();
                z82.f66290a = next;
                z82.f66291b = jSONObject.getString(next);
                z8Arr[i10] = z82;
            } catch (Throwable unused) {
            }
            i10++;
        }
        return z8Arr;
    }

    public final Cursor a() {
        SQLiteDatabase readableDatabase;
        M6 m62 = this.f67840e;
        LinkedHashMap linkedHashMap = this.f67837b;
        m62.f65564a.lock();
        try {
            readableDatabase = m62.f65566c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("sessions", null, M6.a(linkedHashMap), M6.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null) : null;
        m62.f65564a.unlock();
        return cursorQuery;
    }

    public final Cursor a(long j10, Wk wk2) {
        SQLiteDatabase readableDatabase;
        M6 m62 = this.f67840e;
        m62.f65564a.lock();
        try {
            readableDatabase = m62.f65566c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j10), Integer.toString(wk2.f66139a)}, null, null, "number_in_session ASC", null) : null;
        m62.f65564a.unlock();
        return cursorQuery;
    }

    public final C4907k9 a(C5165uh c5165uh, List list, C4941lh c4941lh) {
        C4907k9 c4907k9 = new C4907k9();
        C4701c9 c4701c9 = new C4701c9();
        c4701c9.f66485a = WrapUtils.getOrDefaultIfEmpty(this.f67838c.f67267b, c4941lh.getUuid());
        c4701c9.f66486b = WrapUtils.getOrDefaultIfEmpty(this.f67838c.f67266a, c4941lh.getDeviceId());
        this.f67842g = CodedOutputByteBufferNano.computeMessageSize(4, c4701c9) + this.f67842g;
        c4907k9.f67104b = c4701c9;
        C5047pn c5047pnC = C5009oa.I.C();
        C5115sh c5115sh = new C5115sh(this, c4907k9);
        synchronized (c5047pnC) {
            c5047pnC.f67542a.a(c5115sh);
        }
        c4907k9.f67103a = (C4830h9[]) c5165uh.f67786a.toArray(new C4830h9[0]);
        c4907k9.f67105c = a(c5165uh.f67788c);
        c4907k9.f67107e = (String[]) list.toArray(new String[0]);
        Set set = c4941lh.f67235x;
        String[] strArr = (String[]) set.toArray(new String[0]);
        c4907k9.f67108f = new byte[strArr.length][];
        for (int i10 = 0; i10 < set.size(); i10++) {
            c4907k9.f67108f[i10] = StringUtils.getUTF8Bytes(strArr[i10]);
        }
        return c4907k9;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.appmetrica.analytics.impl.C5140th a(long r17, io.appmetrica.analytics.impl.C4804g9 r19, io.appmetrica.analytics.impl.C4941lh r20, java.util.ArrayList r21, int r22) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5190vh.a(long, io.appmetrica.analytics.impl.g9, io.appmetrica.analytics.impl.lh, java.util.ArrayList, int):io.appmetrica.analytics.impl.th");
    }

    @NonNull
    public final C5165uh a(@NonNull C4941lh c4941lh) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList3 = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor cursorA = a();
            if (cursorA != null) {
                JSONObject jSONObject2 = jSONObject;
                C4847i0 c4847i0 = null;
                while (cursorA.moveToNext() && this.f67843h < 100) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursorA, contentValues);
                        C5130t7 model = new C5155u7(null, 1, null).toModel(contentValues);
                        Long l10 = model.f67718a;
                        if (l10 != null) {
                            C5105s7 c5105s7 = model.f67721d;
                            C4881j9 c4881j9A = Qf.a(c5105s7.f67666a, c5105s7.f67667b, c5105s7.f67668c);
                            String locale = c4941lh.getLocale();
                            Wk wk2 = model.f67719b;
                            C4804g9 c4804g9 = new C4804g9();
                            c4804g9.f66818a = c4881j9A;
                            c4804g9.f66819b = locale;
                            if (wk2 != null) {
                                Integer num = (Integer) Qf.f65813a.get(wk2);
                                c4804g9.f66820c = num != null ? num.intValue() : 0;
                            }
                            int iComputeUInt64Size = this.f67842g + CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE);
                            this.f67842g = iComputeUInt64Size;
                            int iComputeMessageSize = iComputeUInt64Size + CodedOutputByteBufferNano.computeMessageSize(2, c4804g9);
                            this.f67842g = iComputeMessageSize;
                            if (iComputeMessageSize >= 250880) {
                                break;
                            }
                            C5140th c5140thA = a(l10.longValue(), c4804g9, c4941lh, arrayList3, arrayList.size());
                            if (c5140thA == null) {
                                continue;
                            } else {
                                if (c4847i0 == null) {
                                    c4847i0 = c5140thA.f67747b;
                                } else if (!c4847i0.equals(c5140thA.f67747b)) {
                                    break;
                                }
                                arrayList2.add(l10);
                                arrayList.add(c5140thA.f67746a);
                                if (!TextUtils.isEmpty(c5140thA.f67747b.f66948a)) {
                                    try {
                                        jSONObject2 = new JSONObject(c5140thA.f67747b.f66948a);
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (c5140thA.f67748c) {
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorA;
                        jSONObject = jSONObject2;
                        try {
                            arrayList3.add(th);
                        } finally {
                            mo.a(cursor);
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
            mo.a(cursorA);
        } catch (Throwable th3) {
            th = th3;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            this.f67849n.reportError("protobuf_serialization_error", (Throwable) it.next());
        }
        return new C5165uh(arrayList, arrayList2, jSONObject);
    }

    public final void a(boolean z10) {
        yo yoVar = this.f67848m;
        int i10 = this.f67856u;
        synchronized (yoVar) {
            zo zoVar = yoVar.f68052a;
            zoVar.a(zoVar.a().put("report_request_id", i10));
        }
        C4830h9[] c4830h9Arr = this.f67839d.f67103a;
        for (int i11 = 0; i11 < c4830h9Arr.length; i11++) {
            try {
                C4830h9 c4830h9 = c4830h9Arr[i11];
                long jLongValue = ((Long) this.f67841f.get(i11)).longValue();
                Wk wk2 = (Wk) Qf.f65814b.get(c4830h9.f66913b.f66820c);
                if (wk2 == null) {
                    wk2 = Wk.FOREGROUND;
                }
                this.f67840e.a(jLongValue, wk2.f66139a, c4830h9.f66914c.length, z10);
                Qf.a(c4830h9);
            } catch (Throwable unused) {
            }
        }
        M6 m62 = this.f67840e;
        long jA = this.f67836a.f66223j.a();
        m62.f65565b.lock();
        try {
            if (AbstractC5228x5.f67928a.booleanValue()) {
                m62.d();
            }
            SQLiteDatabase writableDatabase = m62.f65566c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", AbstractC5178v5.f67809c, new String[]{String.valueOf(jA)});
            }
        } catch (Throwable unused2) {
        }
        m62.f65565b.unlock();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.f67836a.f66215b.f65832b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f67851p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.f67853r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f67854s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C4941lh) this.f67836a.f66224k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        ((Bl) C5009oa.I.z()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        Cursor cursorRawQuery;
        int iOptInt;
        M6 m62 = this.f67836a.f66218e;
        m62.getClass();
        ArrayList arrayList = new ArrayList();
        m62.f65564a.lock();
        try {
            SQLiteDatabase readableDatabase = m62.f65566c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(AbstractC5178v5.f67808b, null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                        arrayList.add(contentValues);
                    } catch (Throwable unused) {
                        try {
                            arrayList = new ArrayList();
                        } finally {
                            mo.a(cursorRawQuery);
                            m62.f65564a.unlock();
                        }
                    }
                }
            } else {
                cursorRawQuery = null;
            }
        } catch (Throwable unused2) {
            cursorRawQuery = null;
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        ContentValues contentValues2 = (ContentValues) arrayList.get(0);
        this.f67837b.clear();
        for (Map.Entry<String, Object> entry : contentValues2.valueSet()) {
            this.f67837b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues2.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            C4956m7 c4956m7 = new C4956m7();
            this.f67838c = c4956m7;
            this.f67850o.f66390c = c4956m7;
        } else {
            try {
                C4956m7 c4956m72 = new C4956m7(new C4806gb(asString));
                this.f67838c = c4956m72;
                this.f67850o.f66390c = c4956m72;
            } catch (Throwable unused3) {
                C4956m7 c4956m73 = new C4956m7();
                this.f67838c = c4956m73;
                this.f67850o.f66390c = c4956m73;
            }
        }
        C4941lh config = this.f67852q.getConfig();
        List list = config.f67234w;
        if (mo.a((Collection) list)) {
            return false;
        }
        this.f67851p.setHosts(config.f67228q);
        if (!config.u() || mo.a((Collection) this.f67851p.getAllHosts())) {
            this.f67857v = true;
            return false;
        }
        this.f67841f = null;
        C5165uh c5165uhA = a(config);
        this.f67845j = c5165uhA;
        if (c5165uhA.f67786a.isEmpty()) {
            return false;
        }
        yo yoVar = this.f67848m;
        synchronized (yoVar) {
            iOptInt = yoVar.f68052a.a().optInt("report_request_id", -1);
        }
        int i10 = iOptInt + 1;
        this.f67856u = i10;
        this.f67850o.f66392e = i10;
        C4907k9 c4907k9A = a(this.f67845j, list, config);
        this.f67839d = c4907k9A;
        this.f67841f = this.f67845j.f67787b;
        this.f67855t.prepareAndSetPostData(MessageNano.toByteArray(c4907k9A));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.f67855t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z10) {
        String strA;
        if (z10) {
            a(false);
        } else if (this.f67854s.getResponseCode() == 400) {
            a(true);
        }
        if (z10) {
            for (int i10 = 0; i10 < this.f67845j.f67786a.size(); i10++) {
                for (C4778f9 c4778f9 : ((C4830h9) this.f67845j.f67786a.get(i10)).f66914c) {
                    if (c4778f9 != null && (strA = Rf.a(c4778f9)) != null) {
                        this.f67847l.info(strA, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.f67855t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(@Nullable Throwable th2) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f67857v = true;
        this.f67836a.f66218e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.f67857v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((C4929l5) this.f67836a.f66229p).f67189d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
        this.f67836a.f66218e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((C4929l5) this.f67836a.f66229p).f67189d.set(true);
        if (this.f67857v) {
            ((C4929l5) this.f67836a.f66229p).f();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }
}
