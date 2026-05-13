package il;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import cn.w;
import il.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: AsciiCharTree.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f64295b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b<T> f64296a;

    /* JADX INFO: compiled from: AsciiCharTree.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static final int f(CharSequence charSequence) {
            p.k(charSequence, "it");
            return charSequence.length();
        }

        public static final char g(CharSequence charSequence, int i10) {
            p.k(charSequence, "s");
            return charSequence.charAt(i10);
        }

        @NotNull
        public final <T extends CharSequence> c<T> c(@NotNull List<? extends T> list) {
            p.k(list, TypedValues.TransitionType.S_FROM);
            return d(list, new l() { // from class: il.a
                @Override // sn.l
                public final Object invoke(Object obj) {
                    return Integer.valueOf(c.a.f((CharSequence) obj));
                }
            }, new sn.p() { // from class: il.b
                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public final Object mo2invoke(Object obj, Object obj2) {
                    return Character.valueOf(c.a.g((CharSequence) obj, ((Integer) obj2).intValue()));
                }
            });
        }

        @NotNull
        public final <T> c<T> d(@NotNull List<? extends T> list, @NotNull l<? super T, Integer> lVar, @NotNull sn.p<? super T, ? super Integer, Character> pVar) {
            T t10;
            p.k(list, TypedValues.TransitionType.S_FROM);
            p.k(lVar, "length");
            p.k(pVar, "charAt");
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                T next = it.next();
                if (it.hasNext()) {
                    Integer numInvoke = lVar.invoke(next);
                    do {
                        T next2 = it.next();
                        Integer numInvoke2 = lVar.invoke(next2);
                        if (numInvoke.compareTo(numInvoke2) < 0) {
                            next = next2;
                            numInvoke = numInvoke2;
                        }
                    } while (it.hasNext());
                }
                t10 = next;
            } else {
                t10 = null;
            }
            if (t10 == null) {
                throw new NoSuchElementException("Unable to build char tree from an empty list");
            }
            int iIntValue = lVar.invoke(t10).intValue();
            boolean z10 = true;
            if ((list instanceof Collection) && list.isEmpty()) {
                z10 = false;
            } else {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (lVar.invoke(it2.next()).intValue() == 0) {
                        break;
                    }
                }
                z10 = false;
            }
            if (z10) {
                throw new IllegalArgumentException("There should be no empty entries");
            }
            ArrayList arrayList = new ArrayList();
            e(arrayList, list, iIntValue, 0, lVar, pVar);
            arrayList.trimToSize();
            return new c<>(new b((char) 0, w.m(), arrayList));
        }

        public final <T> void e(List<b<T>> list, List<? extends T> list2, int i10, int i11, l<? super T, Integer> lVar, sn.p<? super T, ? super Integer, Character> pVar) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list2) {
                Character chValueOf = Character.valueOf(pVar.mo2invoke(obj, Integer.valueOf(i11)).charValue());
                Object arrayList = linkedHashMap.get(chValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(chValueOf, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                char cCharValue = ((Character) entry.getKey()).charValue();
                List list3 = (List) entry.getValue();
                int i12 = i11 + 1;
                ArrayList arrayList2 = new ArrayList();
                a aVar = c.f64295b;
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (lVar.invoke(next).intValue() > i12) {
                        arrayList3.add(next);
                    }
                }
                aVar.e(arrayList2, arrayList3, i10, i12, lVar, pVar);
                arrayList2.trimToSize();
                ArrayList arrayList4 = new ArrayList();
                for (T t10 : list3) {
                    if (lVar.invoke(t10).intValue() == i12) {
                        arrayList4.add(t10);
                    }
                }
                list.add(new b<>(cCharValue, arrayList4, arrayList2));
            }
        }
    }

    /* JADX INFO: compiled from: AsciiCharTree.kt */
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f64297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<T> f64298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<b<T>> f64299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final b<T>[] f64300d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(char c10, @NotNull List<? extends T> list, @NotNull List<b<T>> list2) {
            p.k(list, "exact");
            p.k(list2, "children");
            this.f64297a = c10;
            this.f64298b = list;
            this.f64299c = list2;
            b<T>[] bVarArr = new b[256];
            int i10 = 0;
            while (i10 < 256) {
                Iterator<T> it = this.f64299c.iterator();
                b<T> bVar = null;
                boolean z10 = false;
                b<T> bVar2 = null;
                while (true) {
                    if (it.hasNext()) {
                        T next = it.next();
                        if (((b) next).f64297a == i10) {
                            if (z10) {
                                break;
                            }
                            z10 = true;
                            bVar2 = next;
                        }
                    } else if (z10) {
                        bVar = bVar2;
                    }
                }
                bVarArr[i10] = bVar;
                i10++;
            }
            this.f64300d = bVarArr;
        }
    }

    public c(@NotNull b<T> bVar) {
        p.k(bVar, "root");
        this.f64296a = bVar;
    }
}
