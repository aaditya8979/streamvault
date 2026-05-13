package uh;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.tracking.EventData;
import io.bidmachine.tracking.EventTrackerImpl;
import io.bidmachine.tracking.SimpleTrackingObject;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: GAMEventTrackerImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class k extends EventTrackerImpl implements j {
    public k(@NonNull AdExtension.EventConfiguration eventConfiguration) {
        super(eventConfiguration);
    }

    @Override // uh.j
    public void trackEvent(@NonNull TrackEventType trackEventType, @NonNull AdsFormat adsFormat, @NonNull EventData eventData, @Nullable BMError bMError) {
        trackEvent(new SimpleTrackingObject(), trackEventType, null, adsFormat.getAdsType(), bMError, eventData);
    }
}
