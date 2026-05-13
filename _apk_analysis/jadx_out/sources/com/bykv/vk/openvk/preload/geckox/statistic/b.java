package com.bykv.vk.openvk.preload.geckox.statistic;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.geckox.c.b.b.f;
import com.bykv.vk.openvk.preload.geckox.c.g;
import com.bykv.vk.openvk.preload.geckox.c.h;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import java.util.Map;

/* JADX INFO: compiled from: UpdateListeners.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static com.bykv.vk.openvk.preload.a.b.a a(final Context context) {
        return new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.4
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
                super.a(bVar, dVar);
                Pair pair = (Pair) bVar.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) pair.second).getChannel());
                aVarA.f11543t = ((Uri) pair.first).toString();
                aVarA.f11537n = e.a(context);
                aVarA.f11545v = SystemClock.uptimeMillis();
                aVarA.f11539p = Long.valueOf(((UpdatePackage) pair.second).getFullPackage().getId());
                aVarA.f11526c = ((UpdatePackage) pair.second).getChannel();
                if (!TextUtils.isEmpty(((UpdatePackage) pair.second).getAccessKey())) {
                    aVarA.f11524a = ((UpdatePackage) pair.second).getAccessKey();
                }
                if (TextUtils.isEmpty(((UpdatePackage) pair.second).getGroupName())) {
                    return;
                }
                aVarA.f11525b = ((UpdatePackage) pair.second).getGroupName();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th2) {
                super.a(bVar, dVar, th2);
                Pair pair = (Pair) bVar.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) pair.second).getChannel());
                String string = ((Uri) pair.first).toString();
                aVarA.f11549z = false;
                aVarA.f11546w = SystemClock.uptimeMillis();
                aVarA.f11544u.add(new StatisticModel.PackageStatisticModel.DownloadFailRecords(string, th2.getMessage()));
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
                super.b(bVar, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar.b(g.class)).second).getChannel());
                aVarA.f11549z = true;
                aVarA.f11546w = SystemClock.uptimeMillis();
            }
        };
    }

    private static com.bykv.vk.openvk.preload.a.b.a a(final com.bykv.vk.openvk.preload.geckox.b bVar) {
        return new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.1
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.a(bVar2, dVar);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onStart", "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th2) {
                super.a(bVar2, dVar, th2);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onException", th2.toString());
                    c.a(bVar, a.a(dVar.b()));
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onEnd", "");
                    if ((dVar instanceof com.bykv.vk.openvk.preload.geckox.c.e) && (dVar.f() instanceof Map)) {
                        bVar.f().put(dVar.getClass().getSimpleName(), ((Map) dVar.f()).get("f36c832c8dbb162c49b46a7a6dd47fbd"));
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th2) {
                super.b(bVar2, dVar, th2);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName() + "onChainException", th2.toString());
                    c.a(bVar, a.a(dVar.b()));
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.c(bVar2, dVar);
                try {
                    c.a(bVar, a.a(dVar.b()));
                } catch (Throwable unused) {
                }
            }
        };
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.a aVar, com.bykv.vk.openvk.preload.geckox.b bVar) {
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.e.class, a(bVar));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.d.class, a(bVar));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.b.c.class, b(bVar.a()));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.b.b.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th2) {
                super.a(bVar2, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.f11532i = false;
                SystemClock.uptimeMillis();
                aVarA.f11540q = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel()).f11532i = true;
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.b.d.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th2) {
                super.a(bVar2, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.f11533j = false;
                SystemClock.uptimeMillis();
                aVarA.f11541r = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel()).f11533j = true;
                SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.b.a.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th2) {
                super.a(bVar2, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.f11533j = false;
                aVarA.f11535l = SystemClock.uptimeMillis();
                aVarA.f11541r = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.f11533j = true;
                aVarA.f11535l = SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.b.e.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.11
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th2) {
                super.a(bVar2, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.f11534k = false;
                aVarA.f11542s = th2.getMessage();
                aVarA.f11536m = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.f11534k = true;
                aVarA.f11536m = SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.a.b.class, a(bVar.a()));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.a.a.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th2) {
                super.a(bVar2, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.A = false;
                aVarA.f11547x = SystemClock.uptimeMillis();
                aVarA.C = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.A = true;
                aVarA.f11547x = SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.a.c.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.10
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th2) {
                super.a(bVar2, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.B = false;
                aVarA.f11548y = SystemClock.uptimeMillis();
                aVarA.D = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.B = true;
                aVarA.f11548y = SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.b.c.class, b(bVar.a()));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.b.b.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th2) {
                super.a(bVar2, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.f11532i = false;
                SystemClock.uptimeMillis();
                aVarA.f11540q = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel()).f11532i = true;
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.b.d.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th2) {
                super.a(bVar2, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.f11533j = false;
                SystemClock.uptimeMillis();
                aVarA.f11541r = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel()).f11533j = true;
                SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.b.a.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th2) {
                super.a(bVar2, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.f11533j = false;
                aVarA.f11535l = SystemClock.uptimeMillis();
                aVarA.f11541r = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.f11533j = true;
                aVarA.f11535l = SystemClock.uptimeMillis();
            }
        });
        aVar.a(f.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.3
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th2) {
                super.a(bVar2, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.f11534k = false;
                aVarA.f11536m = SystemClock.uptimeMillis();
                aVarA.f11542s = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th2) {
                super.b(bVar2, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.f11534k = false;
                aVarA.f11536m = SystemClock.uptimeMillis();
                aVarA.D = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.c(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.f11534k = true;
                aVarA.f11536m = SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.a.b.class, a(bVar.a()));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.a.a.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th2) {
                super.a(bVar2, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.A = false;
                aVarA.f11547x = SystemClock.uptimeMillis();
                aVarA.C = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.A = true;
                aVarA.f11547x = SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.a.d.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.2
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th2) {
                super.a(bVar2, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.B = false;
                aVarA.f11548y = SystemClock.uptimeMillis();
                aVarA.D = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th2) {
                super.b(bVar2, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.B = false;
                aVarA.f11548y = SystemClock.uptimeMillis();
                aVarA.D = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.c(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.B = true;
                aVarA.f11548y = SystemClock.uptimeMillis();
            }
        });
    }

    private static com.bykv.vk.openvk.preload.a.b.a b(final Context context) {
        return new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.5
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
                super.a(bVar, dVar);
                Pair pair = (Pair) bVar.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) pair.second).getChannel());
                aVarA.f11527d = ((Uri) pair.first).toString();
                aVarA.f11537n = e.a(context);
                aVarA.f11529f = SystemClock.uptimeMillis();
                aVarA.f11538o = Long.valueOf(((UpdatePackage) pair.second).getPatch().getId());
                aVarA.f11539p = Long.valueOf(((UpdatePackage) pair.second).getFullPackage().getId());
                aVarA.f11526c = ((UpdatePackage) pair.second).getChannel();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th2) {
                super.a(bVar, dVar, th2);
                Pair pair = (Pair) bVar.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) pair.second).getChannel());
                String string = ((Uri) pair.first).toString();
                aVarA.f11531h = false;
                aVarA.f11530g = SystemClock.uptimeMillis();
                aVarA.f11528e.add(new StatisticModel.PackageStatisticModel.DownloadFailRecords(string, th2.getMessage()));
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
                super.b(bVar, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar.b(h.class)).second).getChannel());
                aVarA.f11531h = true;
                aVarA.f11530g = SystemClock.uptimeMillis();
            }
        };
    }
}
