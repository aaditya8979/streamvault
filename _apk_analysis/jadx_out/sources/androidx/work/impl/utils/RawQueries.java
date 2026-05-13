package androidx.work.impl.utils;

import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import cn.f0;
import cn.x;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: RawQueries.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u001c\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\n"}, d2 = {"Landroidx/work/WorkQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "toRawQuery", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "count", "Lbn/r;", "bindings", "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class RawQueries {
    private static final void bindings(StringBuilder sb2, int i10) {
        if (i10 <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add("?");
        }
        sb2.append(f0.D0(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null));
    }

    @NotNull
    public static final SupportSQLiteQuery toRawQuery(@NotNull WorkQuery workQuery) {
        p.k(workQuery, "<this>");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("SELECT * FROM workspec");
        p.j(workQuery.getStates(), "states");
        String str = " AND";
        String str2 = " WHERE";
        if (!r2.isEmpty()) {
            List<WorkInfo.State> states = workQuery.getStates();
            p.j(states, "states");
            ArrayList arrayList2 = new ArrayList(x.x(states, 10));
            for (WorkInfo.State state : states) {
                p.h(state);
                arrayList2.add(Integer.valueOf(WorkTypeConverters.stateToInt(state)));
            }
            sb2.append(" WHERE state IN (");
            bindings(sb2, arrayList2.size());
            sb2.append(")");
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        p.j(workQuery.getIds(), "ids");
        if (!r2.isEmpty()) {
            List<UUID> ids = workQuery.getIds();
            p.j(ids, "ids");
            ArrayList arrayList3 = new ArrayList(x.x(ids, 10));
            Iterator<T> it = ids.iterator();
            while (it.hasNext()) {
                arrayList3.add(((UUID) it.next()).toString());
            }
            sb2.append(str2 + " id IN (");
            bindings(sb2, workQuery.getIds().size());
            sb2.append(")");
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        p.j(workQuery.getTags(), "tags");
        if (!r2.isEmpty()) {
            sb2.append(str2 + " id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            bindings(sb2, workQuery.getTags().size());
            sb2.append("))");
            List<String> tags = workQuery.getTags();
            p.j(tags, "tags");
            arrayList.addAll(tags);
        } else {
            str = str2;
        }
        p.j(workQuery.getUniqueWorkNames(), "uniqueWorkNames");
        if (!r2.isEmpty()) {
            sb2.append(str + " id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            bindings(sb2, workQuery.getUniqueWorkNames().size());
            sb2.append("))");
            List<String> uniqueWorkNames = workQuery.getUniqueWorkNames();
            p.j(uniqueWorkNames, "uniqueWorkNames");
            arrayList.addAll(uniqueWorkNames);
        }
        sb2.append(";");
        String string = sb2.toString();
        p.j(string, "builder.toString()");
        return new SimpleSQLiteQuery(string, arrayList.toArray(new Object[0]));
    }
}
