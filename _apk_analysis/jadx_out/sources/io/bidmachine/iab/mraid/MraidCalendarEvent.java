package io.bidmachine.iab.mraid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class MraidCalendarEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Date f69229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f69230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f69231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Date f69232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f69233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f69234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f69235h;

    public MraidCalendarEvent(String str, Date date) {
        this.f69228a = str;
        this.f69229b = date;
    }

    public void a(String str) {
        this.f69230c = str;
    }

    public void a(Date date) {
        this.f69232e = date;
    }

    public void b(String str) {
        this.f69235h = str;
    }

    public void c(String str) {
        this.f69233f = str;
    }

    public void d(String str) {
        this.f69231d = str;
    }

    public void e(String str) {
        this.f69234g = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MraidCalendarEvent)) {
            return false;
        }
        MraidCalendarEvent mraidCalendarEvent = (MraidCalendarEvent) obj;
        return Objects.equals(this.f69228a, mraidCalendarEvent.f69228a) && Objects.equals(this.f69229b, mraidCalendarEvent.f69229b) && Objects.equals(this.f69230c, mraidCalendarEvent.f69230c) && Objects.equals(this.f69231d, mraidCalendarEvent.f69231d) && Objects.equals(this.f69232e, mraidCalendarEvent.f69232e) && Objects.equals(this.f69233f, mraidCalendarEvent.f69233f) && Objects.equals(this.f69234g, mraidCalendarEvent.f69234g) && Objects.equals(this.f69235h, mraidCalendarEvent.f69235h);
    }

    @NonNull
    public String getDescription() {
        return this.f69228a;
    }

    @Nullable
    public Date getEnd() {
        return this.f69232e;
    }

    @Nullable
    public String getLocation() {
        return this.f69230c;
    }

    @Nullable
    public String getRecurrence() {
        return this.f69235h;
    }

    @NonNull
    public Date getStart() {
        return this.f69229b;
    }

    @Nullable
    public String getStatus() {
        return this.f69233f;
    }

    @Nullable
    public String getSummary() {
        return this.f69231d;
    }

    @Nullable
    public String getTransparency() {
        return this.f69234g;
    }

    public int hashCode() {
        return Objects.hash(this.f69228a, this.f69229b, this.f69230c, this.f69231d, this.f69232e, this.f69233f, this.f69234g, this.f69235h);
    }

    @NonNull
    public String toString() {
        return "MraidCalendarEvent{description='" + this.f69228a + "', start=" + this.f69229b + ", location='" + this.f69230c + "', summary='" + this.f69231d + "', end=" + this.f69232e + ", status='" + this.f69233f + "', transparency='" + this.f69234g + "', recurrence='" + this.f69235h + "'}";
    }
}
