package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: WebTriggerRegistrationRequest.kt */
/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(33)
public final class WebTriggerRegistrationRequest {

    @NotNull
    private final Uri destination;

    @NotNull
    private final List<WebTriggerParams> webTriggerParams;

    public WebTriggerRegistrationRequest(@NotNull List<WebTriggerParams> list, @NotNull Uri uri) {
        p.k(list, "webTriggerParams");
        p.k(uri, "destination");
        this.webTriggerParams = list;
        this.destination = uri;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebTriggerRegistrationRequest)) {
            return false;
        }
        WebTriggerRegistrationRequest webTriggerRegistrationRequest = (WebTriggerRegistrationRequest) obj;
        return p.f(this.webTriggerParams, webTriggerRegistrationRequest.webTriggerParams) && p.f(this.destination, webTriggerRegistrationRequest.destination);
    }

    @NotNull
    public final Uri getDestination() {
        return this.destination;
    }

    @NotNull
    public final List<WebTriggerParams> getWebTriggerParams() {
        return this.webTriggerParams;
    }

    public int hashCode() {
        return (this.webTriggerParams.hashCode() * 31) + this.destination.hashCode();
    }

    @NotNull
    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.webTriggerParams + ", Destination=" + this.destination;
    }
}
