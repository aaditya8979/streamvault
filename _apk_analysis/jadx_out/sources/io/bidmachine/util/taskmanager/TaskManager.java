package io.bidmachine.util.taskmanager;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: TaskManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lio/bidmachine/util/taskmanager/TaskManager;", "", "Ljava/lang/Runnable;", "task", "Lbn/r;", "execute", "", "executeSafely", "", "delayMs", "schedule", "scheduleSafely", "delay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "cancel", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public interface TaskManager {
    void cancel(@NotNull Runnable runnable);

    default void execute(@NotNull Runnable runnable) throws Throwable {
        p.k(runnable, "task");
        schedule(runnable, 0L);
    }

    default boolean executeSafely(@NotNull Runnable task) {
        Boolean bool;
        p.k(task, "task");
        try {
            execute(task);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return p.f(bool, Boolean.TRUE);
    }

    void schedule(@NotNull Runnable runnable, long j10) throws Throwable;

    default void schedule(@NotNull Runnable runnable, long j10, @NotNull TimeUnit timeUnit) throws Throwable {
        p.k(runnable, "task");
        p.k(timeUnit, "timeUnit");
        schedule(runnable, timeUnit.toMillis(j10));
    }

    default boolean scheduleSafely(@NotNull Runnable task, long delayMs) {
        Boolean bool;
        p.k(task, "task");
        try {
            schedule(task, delayMs);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return p.f(bool, Boolean.TRUE);
    }

    default boolean scheduleSafely(@NotNull Runnable task, long delay, @NotNull TimeUnit timeUnit) {
        Boolean bool;
        p.k(task, "task");
        p.k(timeUnit, "timeUnit");
        try {
            schedule(task, delay, timeUnit);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return p.f(bool, Boolean.TRUE);
    }
}
