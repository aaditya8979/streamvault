package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f7919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f7921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f7922e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Deque f7923f = new ArrayDeque();

    public c4(com.applovin.impl.sdk.k kVar) {
        this.f7918a = (String) kVar.a(x4.f10850u4);
        this.f7919b = kVar.c(x4.f10858v4);
        this.f7920c = ((Integer) kVar.a(x4.f10866w4)).intValue();
    }

    private void a(long j10, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.f7922e.get(str2);
        if (map == null) {
            map = new HashMap();
            this.f7922e.put(str2, map);
        }
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.add(Long.valueOf(j10));
    }

    public Long a() {
        return this.f7921d;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || this.f7920c <= 0) {
            return;
        }
        Map map = (Map) this.f7922e.remove(str);
        if (CollectionUtils.isEmpty(map)) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("cc_ms", Long.valueOf(System.currentTimeMillis()));
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (!CollectionUtils.isEmpty(list)) {
                long jLongValue = 0;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                map2.put((String) entry.getKey(), Long.valueOf(jLongValue / ((long) list.size())));
            }
        }
        if (this.f7923f.size() == this.f7920c) {
            this.f7923f.pollLast();
        }
        this.f7923f.addFirst(map2);
    }

    public Deque b() {
        return this.f7923f;
    }

    public void b(long j10, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!CollectionUtils.isEmpty(this.f7919b) && this.f7920c > 0) {
            Iterator it = this.f7919b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (StringUtils.isValidString(str3) && str.endsWith(str3)) {
                    a(j10, str3, str2);
                    break;
                }
            }
        }
        if (StringUtils.isValidString(this.f7918a) && str.endsWith(this.f7918a)) {
            this.f7921d = Long.valueOf(j10);
        }
    }
}
