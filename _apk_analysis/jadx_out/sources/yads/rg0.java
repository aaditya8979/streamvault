package yads;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes8.dex */
public final class rg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f94435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f94438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f94439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f94440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f94441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f94442h;

    public rg0(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.f94436b = str;
        this.f94437c = "".equals(str2) ? null : str2;
        this.f94438d = j10;
        this.f94439e = j11;
        this.f94440f = j12;
        this.f94441g = j13;
        this.f94442h = list;
    }

    public static List a(lr lrVar) {
        List list = lrVar.f92071h;
        if (list != null) {
            return list;
        }
        Map map = lrVar.f92070g;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new q01((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public static rg0 a(sg0 sg0Var) throws IOException {
        if (tg0.a(sg0Var) != 538247942) {
            throw new IOException();
        }
        String str = new String(tg0.a(sg0Var, tg0.b(sg0Var)), "UTF-8");
        String str2 = new String(tg0.a(sg0Var, tg0.b(sg0Var)), "UTF-8");
        long jB = tg0.b(sg0Var);
        long jB2 = tg0.b(sg0Var);
        long jB3 = tg0.b(sg0Var);
        long jB4 = tg0.b(sg0Var);
        int iA = tg0.a(sg0Var);
        if (iA < 0) {
            throw new IOException(mg2.a("readHeaderList size=", iA));
        }
        List listEmptyList = iA == 0 ? Collections.emptyList() : new ArrayList();
        int i10 = 0;
        while (i10 < iA) {
            listEmptyList.add(new q01(new String(tg0.a(sg0Var, tg0.b(sg0Var)), "UTF-8").intern(), new String(tg0.a(sg0Var, tg0.b(sg0Var)), "UTF-8").intern()));
            i10++;
            jB4 = jB4;
            jB3 = jB3;
        }
        return new rg0(str, str2, jB, jB2, jB3, jB4, listEmptyList);
    }

    public final lr a(byte[] bArr) {
        lr lrVar = new lr();
        lrVar.f92064a = bArr;
        lrVar.f92065b = this.f94437c;
        lrVar.f92066c = this.f94438d;
        lrVar.f92067d = this.f94439e;
        lrVar.f92068e = this.f94440f;
        lrVar.f92069f = this.f94441g;
        List<q01> list = this.f94442h;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (q01 q01Var : list) {
            treeMap.put(q01Var.f93849a, q01Var.f93850b);
        }
        lrVar.f92070g = treeMap;
        lrVar.f92071h = Collections.unmodifiableList(this.f94442h);
        return lrVar;
    }

    public final boolean a(BufferedOutputStream bufferedOutputStream) {
        try {
            tg0.a(bufferedOutputStream, 538247942);
            byte[] bytes = this.f94436b.getBytes("UTF-8");
            tg0.a(bufferedOutputStream, bytes.length);
            bufferedOutputStream.write(bytes, 0, bytes.length);
            String str = this.f94437c;
            if (str == null) {
                str = "";
            }
            byte[] bytes2 = str.getBytes("UTF-8");
            tg0.a(bufferedOutputStream, bytes2.length);
            bufferedOutputStream.write(bytes2, 0, bytes2.length);
            tg0.a(bufferedOutputStream, this.f94438d);
            tg0.a(bufferedOutputStream, this.f94439e);
            tg0.a(bufferedOutputStream, this.f94440f);
            tg0.a(bufferedOutputStream, this.f94441g);
            List<q01> list = this.f94442h;
            if (list != null) {
                tg0.a(bufferedOutputStream, list.size());
                for (q01 q01Var : list) {
                    byte[] bytes3 = q01Var.f93849a.getBytes("UTF-8");
                    tg0.a(bufferedOutputStream, bytes3.length);
                    bufferedOutputStream.write(bytes3, 0, bytes3.length);
                    byte[] bytes4 = q01Var.f93850b.getBytes("UTF-8");
                    tg0.a(bufferedOutputStream, bytes4.length);
                    bufferedOutputStream.write(bytes4, 0, bytes4.length);
                }
            } else {
                tg0.a(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            return true;
        } catch (IOException unused) {
            boolean z10 = lm3.f92036a;
            boolean z11 = ad1.f87661a;
            return false;
        }
    }
}
