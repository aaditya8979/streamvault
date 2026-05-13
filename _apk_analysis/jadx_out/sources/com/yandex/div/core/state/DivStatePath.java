package com.yandex.div.core.state;

import ah.e2;
import androidx.annotation.VisibleForTesting;
import bn.g;
import bn.h;
import bo.d0;
import cn.b0;
import cn.f0;
import cn.v;
import cn.w;
import com.yandex.div.core.expression.local.ChildPathUnitCache;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div2.Div;
import com.yandex.div2.DivData;
import com.yandex.div2.DivState;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.i;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: DivStatePath.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivStatePath {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final boolean containsOnlyStates;

    @NotNull
    private final g fullPath$delegate;

    @NotNull
    private final List<String> path;

    @NotNull
    private final List<Pair<String, String>> states;

    @NotNull
    private final g statesString$delegate;
    private final long topLevelStateId;

    /* JADX INFO: compiled from: DivStatePath.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int alphabeticalComparator$lambda$2(DivStatePath divStatePath, DivStatePath divStatePath2) {
            if (divStatePath.getTopLevelStateId() != divStatePath2.getTopLevelStateId()) {
                return (int) (divStatePath.getTopLevelStateId() - divStatePath2.getTopLevelStateId());
            }
            int iMin = Math.min(divStatePath.states.size(), divStatePath2.states.size());
            for (int i10 = 0; i10 < iMin; i10++) {
                Pair pair = (Pair) divStatePath.states.get(i10);
                Pair pair2 = (Pair) divStatePath2.states.get(i10);
                int iCompareTo = DivStatePathKt.getDivId(pair).compareTo(DivStatePathKt.getDivId(pair2));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = DivStatePathKt.getStateId(pair).compareTo(DivStatePathKt.getStateId(pair2));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
            }
            return divStatePath.states.size() - divStatePath2.states.size();
        }

        private final List<String> extractStates(List<String> list, List<Pair<String, String>> list2, boolean z10) {
            Iterator<T> it = list2.iterator();
            int iFindState = 0;
            while (it.hasNext()) {
                iFindState = DivStatePath.Companion.findState(list, (Pair) it.next(), iFindState);
            }
            if (z10) {
                iFindState++;
            }
            return list.subList(0, iFindState);
        }

        private final List<Pair<String, String>> findSharedPairs(DivStatePath divStatePath, DivStatePath divStatePath2) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (Object obj : divStatePath.states) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    w.w();
                }
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) f0.w0(divStatePath2.states, i10);
                if (pair2 == null || !p.f(pair, pair2)) {
                    break;
                }
                arrayList.add(pair);
                i10 = i11;
            }
            return arrayList;
        }

        private final int findState(List<String> list, Pair<String, String> pair, int i10) {
            int size = list.size() - 1;
            while (i10 < size) {
                if (p.f(list.get(i10), DivStatePathKt.getDivId(pair))) {
                    int i11 = i10 + 1;
                    if (p.f(list.get(i11), DivStatePathKt.getStateId(pair))) {
                        return i11;
                    }
                }
                i10++;
            }
            return list.size();
        }

        @NotNull
        public final Comparator<DivStatePath> alphabeticalComparator$div_release() {
            return new Comparator() { // from class: gg.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DivStatePath.Companion.alphabeticalComparator$lambda$2((DivStatePath) obj, (DivStatePath) obj2);
                }
            };
        }

        @NotNull
        public final DivStatePath fromRootDiv$div_release(long j10, @NotNull Div div) {
            String[] strArr = new String[2];
            strArr[0] = String.valueOf(j10);
            String id2 = DivPathUtils.INSTANCE.getId(div);
            if (id2 == null) {
                id2 = ChildPathUnitCache.INSTANCE.getValue$div_release(0);
            }
            strArr[1] = id2;
            return new DivStatePath(j10, w.m(), w.p(strArr), false, 8, null);
        }

        @NotNull
        public final DivStatePath fromState(long j10) {
            return new DivStatePath(j10, new ArrayList(), null, false, 12, null);
        }

        @NotNull
        public final DivStatePath fromState$div_release(@NotNull DivData.State state) {
            return fromRootDiv$div_release(state.f55092b, state.f55091a);
        }

        @Nullable
        public final DivStatePath lowestCommonAncestor$div_release(@NotNull DivStatePath divStatePath, @NotNull DivStatePath divStatePath2) {
            if (divStatePath.getTopLevelStateId() != divStatePath2.getTopLevelStateId()) {
                return null;
            }
            List<Pair<String, String>> listFindSharedPairs = findSharedPairs(divStatePath, divStatePath2);
            return new DivStatePath(divStatePath.getTopLevelStateId(), listFindSharedPairs, extractStates(divStatePath.getPath$div_release(), listFindSharedPairs, true), divStatePath.getContainsOnlyStates$div_release() || divStatePath2.getContainsOnlyStates$div_release());
        }

        @NotNull
        public final DivStatePath parse(@NotNull String str) throws PathFormatException {
            ArrayList arrayList = new ArrayList();
            List listU0 = d0.U0(str, new String[]{"/"}, false, 0, 6, null);
            try {
                long j10 = Long.parseLong((String) listU0.get(0));
                if (listU0.size() % 2 != 1) {
                    throw new PathFormatException("Must be even number of states in path: " + str, null, 2, null);
                }
                zn.g gVarU = n.u(n.v(1, listU0.size()), 2);
                int iF = gVarU.f();
                int iG = gVarU.g();
                int iH = gVarU.h();
                if ((iH > 0 && iF <= iG) || (iH < 0 && iG <= iF)) {
                    while (true) {
                        arrayList.add(h.a(listU0.get(iF), listU0.get(iF + 1)));
                        if (iF == iG) {
                            break;
                        }
                        iF += iH;
                    }
                }
                return new DivStatePath(j10, arrayList, listU0, true);
            } catch (NumberFormatException e10) {
                throw new PathFormatException("Top level id must be number: " + str, e10);
            }
        }
    }

    @VisibleForTesting
    public DivStatePath(long j10, @NotNull List<Pair<String, String>> list, @NotNull List<String> list2, boolean z10) {
        this.topLevelStateId = j10;
        this.states = list;
        this.path = list2;
        this.containsOnlyStates = z10;
        this.fullPath$delegate = b.b(new a<String>() { // from class: com.yandex.div.core.state.DivStatePath$fullPath$2
            {
                super(0);
            }

            @Override // sn.a
            @NotNull
            public final String invoke() {
                return f0.D0(this.this$0.getPath$div_release(), "/", null, null, 0, null, null, 62, null);
            }
        });
        this.statesString$delegate = b.b(new a<String>() { // from class: com.yandex.div.core.state.DivStatePath$statesString$2
            {
                super(0);
            }

            @Override // sn.a
            @NotNull
            public final String invoke() {
                if (!(!this.this$0.states.isEmpty())) {
                    return String.valueOf(this.this$0.getTopLevelStateId());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.this$0.getTopLevelStateId());
                sb2.append('/');
                List<Pair> list3 = this.this$0.states;
                ArrayList arrayList = new ArrayList();
                for (Pair pair : list3) {
                    b0.F(arrayList, w.p(DivStatePathKt.getDivId(pair), DivStatePathKt.getStateId(pair)));
                }
                sb2.append(f0.D0(arrayList, "/", null, null, 0, null, null, 62, null));
                return sb2.toString();
            }
        });
    }

    public /* synthetic */ DivStatePath(long j10, List list, List list2, boolean z10, int i10, i iVar) {
        this(j10, (i10 & 2) != 0 ? w.m() : list, (i10 & 4) != 0 ? v.e(String.valueOf(j10)) : list2, (i10 & 8) != 0 ? false : z10);
    }

    private final List<String> createFullPath(String str) {
        ArrayList arrayList = new ArrayList(this.path.size() + 1);
        arrayList.addAll(this.path);
        arrayList.add(str);
        return arrayList;
    }

    @NotNull
    public static final DivStatePath parse(@NotNull String str) throws PathFormatException {
        return Companion.parse(str);
    }

    @NotNull
    public final DivStatePath append$div_release(@NotNull String str, @Nullable DivState.State state, @NotNull String str2) {
        String str3;
        Div div;
        e2 e2VarB;
        String id2;
        ArrayList arrayList = new ArrayList(this.states.size() + 1);
        arrayList.addAll(this.states);
        if (state == null || (str3 = state.f57195d) == null) {
            str3 = str2;
        }
        arrayList.add(h.a(str, str3));
        if (state != null && (div = state.f57194c) != null && (e2VarB = div.b()) != null && (id2 = e2VarB.getId()) != null) {
            str2 = id2;
        } else if (state != null) {
            str2 = state.f57195d;
        }
        return new DivStatePath(this.topLevelStateId, arrayList, createFullPath(str2), false, 8, null);
    }

    @NotNull
    public final DivStatePath appendDiv(@NotNull String str) {
        return new DivStatePath(this.topLevelStateId, this.states, createFullPath(str), false, 8, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivStatePath)) {
            return false;
        }
        DivStatePath divStatePath = (DivStatePath) obj;
        return this.topLevelStateId == divStatePath.topLevelStateId && p.f(this.states, divStatePath.states) && p.f(this.path, divStatePath.path) && this.containsOnlyStates == divStatePath.containsOnlyStates;
    }

    public final boolean getContainsOnlyStates$div_release() {
        return this.containsOnlyStates;
    }

    @NotNull
    public final String getFullPath$div_release() {
        return (String) this.fullPath$delegate.getValue();
    }

    @NotNull
    public final String getLastDivId$div_release() {
        return (String) f0.F0(this.path);
    }

    @Nullable
    public final String getLastStateId() {
        if (this.states.isEmpty()) {
            return null;
        }
        return DivStatePathKt.getStateId((Pair) f0.F0(this.states));
    }

    @NotNull
    public final List<String> getPath$div_release() {
        return this.path;
    }

    @Nullable
    public final String getPathToLastState() {
        if (this.states.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new DivStatePath(this.topLevelStateId, this.states.subList(0, r1.size() - 1), this.path, false, 8, null).getStatesString$div_release());
        sb2.append('/');
        sb2.append(DivStatePathKt.getDivId((Pair) f0.F0(this.states)));
        return sb2.toString();
    }

    @NotNull
    public final List<Pair<String, String>> getStates() {
        return this.states;
    }

    @NotNull
    public final String getStatesString$div_release() {
        return (String) this.statesString$delegate.getValue();
    }

    public final long getTopLevelStateId() {
        return this.topLevelStateId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.topLevelStateId) * 31) + this.states.hashCode()) * 31) + this.path.hashCode()) * 31;
        boolean z10 = this.containsOnlyStates;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final boolean isAncestorOf(@NotNull DivStatePath divStatePath) {
        if (this.topLevelStateId != divStatePath.topLevelStateId || this.states.size() >= divStatePath.states.size()) {
            return false;
        }
        int i10 = 0;
        for (Object obj : this.states) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.w();
            }
            Pair pair = (Pair) obj;
            Pair<String, String> pair2 = divStatePath.states.get(i10);
            if (!p.f(DivStatePathKt.getDivId(pair), DivStatePathKt.getDivId(pair2)) || !p.f(DivStatePathKt.getStateId(pair), DivStatePathKt.getStateId(pair2))) {
                return false;
            }
            i10 = i11;
        }
        return true;
    }

    public final boolean isRootPath() {
        return this.states.isEmpty();
    }

    @NotNull
    public final DivStatePath parentState() {
        int iNextIndex;
        int iNextIndex2;
        if (isRootPath()) {
            return this;
        }
        List listJ1 = f0.j1(this.states);
        Pair pair = (Pair) listJ1.remove(w.o(listJ1));
        List<String> list = this.path;
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (true) {
            iNextIndex = -1;
            if (!listIterator.hasPrevious()) {
                iNextIndex2 = -1;
                break;
            }
            if (p.f(listIterator.previous(), DivStatePathKt.getDivId(pair))) {
                iNextIndex2 = listIterator.nextIndex();
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(iNextIndex2);
        if (!(numValueOf.intValue() != -1)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iNextIndex = numValueOf.intValue();
        } else {
            List<String> list2 = this.path;
            ListIterator<String> listIterator2 = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    break;
                }
                if (p.f(d0.p1(listIterator2.previous(), '#', null, 2, null), DivStatePathKt.getDivId(pair))) {
                    iNextIndex = listIterator2.nextIndex();
                    break;
                }
            }
        }
        return new DivStatePath(this.topLevelStateId, listJ1, this.path.subList(0, iNextIndex + 1), false, 8, null);
    }

    @NotNull
    public String toString() {
        return getFullPath$div_release();
    }
}
