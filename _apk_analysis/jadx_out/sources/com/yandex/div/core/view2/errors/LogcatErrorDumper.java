package com.yandex.div.core.view2.errors;

import bn.d;
import cn.f0;
import com.yandex.div.DivDataTag;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.ParsingException;
import com.yandex.div.logging.Severity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: LogcatErrorDumper.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class LogcatErrorDumper {

    @NotNull
    private final Set<Throwable> loggedErrors = new LinkedHashSet();

    @NotNull
    private final Set<Throwable> loggedWarnings = new LinkedHashSet();

    private final String errorsToDetails(List<? extends Throwable> list) {
        return f0.D0(list, "\n", null, null, 0, null, new l<Throwable, CharSequence>() { // from class: com.yandex.div.core.view2.errors.LogcatErrorDumper.errorsToDetails.1
            @Override // sn.l
            @NotNull
            public final CharSequence invoke(@NotNull Throwable th2) {
                if (!(th2 instanceof ParsingException)) {
                    return " - " + d.b(th2);
                }
                return " - " + ((ParsingException) th2).getReason() + ": " + d.b(th2);
            }
        }, 30, null);
    }

    public final void logErrors(@NotNull List<? extends Throwable> list, @NotNull List<? extends Throwable> list2, @Nullable DivDataTag divDataTag) {
        if (list.isEmpty() && list2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.loggedErrors.add((Throwable) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (this.loggedWarnings.add((Throwable) obj2)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList.isEmpty()) {
            KLog kLog = KLog.INSTANCE;
            Severity severity = Severity.ERROR;
            if (kLog.isAtLeast(severity)) {
                kLog.print(6, "ErrorVisualMonitor", "=== DIV VISUAL ERROR MONITOR - NEW ERRORS DETECTED ===");
            }
            if (kLog.isAtLeast(severity)) {
                kLog.print(6, "ErrorVisualMonitor", errorsToDetails(arrayList));
            }
        }
        if (!arrayList2.isEmpty()) {
            KLog kLog2 = KLog.INSTANCE;
            Severity severity2 = Severity.WARNING;
            if (kLog2.isAtLeast(severity2)) {
                kLog2.print(5, "ErrorVisualMonitor", "=== DIV VISUAL ERROR MONITOR - NEW WARNINGS DETECTED ===");
            }
            if (kLog2.isAtLeast(severity2)) {
                kLog2.print(5, "ErrorVisualMonitor", errorsToDetails(arrayList2));
            }
        }
        if ((!arrayList.isEmpty()) || (!arrayList2.isEmpty())) {
            KLog kLog3 = KLog.INSTANCE;
            if (kLog3.isAtLeast(Severity.INFO)) {
                kLog3.print(4, "ErrorVisualMonitor", "DataTag '" + divDataTag + "'. New errors: " + arrayList.size() + ", New warnings: " + arrayList2.size() + ". Total errors: " + list.size() + ", Total warnings: " + list2.size());
            }
        }
    }
}
