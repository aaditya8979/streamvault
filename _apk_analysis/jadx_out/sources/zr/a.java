package zr;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ds.k;
import ds.m;
import er.e;
import er.g;
import er.h;
import er.i;
import er.j;
import es.c;
import es.d;
import es.f;
import java.beans.PropertyChangeSupport;
import java.net.URI;
import org.eclipse.jetty.util.security.Constraint;
import org.fourthline.cling.model.types.b;
import org.fourthline.cling.support.avtransport.AVTransportException;
import org.fourthline.cling.support.avtransport.lastchange.AVTransportVariable;
import org.fourthline.cling.support.model.PlayMode;
import org.fourthline.cling.support.model.RecordMediumWriteStatus;
import org.fourthline.cling.support.model.RecordQualityMode;
import org.fourthline.cling.support.model.SeekMode;
import org.fourthline.cling.support.model.StorageMedium;
import org.fourthline.cling.support.model.TransportAction;
import org.fourthline.cling.support.model.TransportState;
import org.fourthline.cling.support.model.TransportStatus;

/* JADX INFO: compiled from: AbstractAVTransportService.java */
/* JADX INFO: loaded from: classes10.dex */
@g(serviceId = @h("AVTransport"), serviceType = @i(value = "AVTransport", version = 1), stringConvertibleTypes = {k.class})
@er.k({@j(allowedValuesEnum = TransportState.class, name = "TransportState", sendEvents = false), @j(allowedValuesEnum = TransportStatus.class, name = "TransportStatus", sendEvents = false), @j(allowedValuesEnum = StorageMedium.class, defaultValue = Constraint.NONE, name = "PlaybackStorageMedium", sendEvents = false), @j(allowedValuesEnum = StorageMedium.class, defaultValue = "NOT_IMPLEMENTED", name = "RecordStorageMedium", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "NETWORK", name = "PossiblePlaybackStorageMedia", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "NOT_IMPLEMENTED", name = "PossibleRecordStorageMedia", sendEvents = false), @j(allowedValuesEnum = PlayMode.class, defaultValue = "NORMAL", name = "CurrentPlayMode", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "1", name = "TransportPlaySpeed", sendEvents = false), @j(allowedValuesEnum = RecordMediumWriteStatus.class, defaultValue = "NOT_IMPLEMENTED", name = "RecordMediumWriteStatus", sendEvents = false), @j(allowedValuesEnum = RecordQualityMode.class, defaultValue = "NOT_IMPLEMENTED", name = "CurrentRecordQualityMode", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "NOT_IMPLEMENTED", name = "PossibleRecordQualityModes", sendEvents = false), @j(datatype = "ui4", defaultValue = "0", name = "NumberOfTracks", sendEvents = false), @j(datatype = "ui4", defaultValue = "0", name = "CurrentTrack", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "CurrentTrackDuration", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "00:00:00", name = "CurrentMediaDuration", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "NOT_IMPLEMENTED", name = "CurrentTrackMetaData", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "CurrentTrackURI", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "AVTransportURI", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "NOT_IMPLEMENTED", name = "AVTransportURIMetaData", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "NOT_IMPLEMENTED", name = "NextAVTransportURI", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, defaultValue = "NOT_IMPLEMENTED", name = "NextAVTransportURIMetaData", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "RelativeTimePosition", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "AbsoluteTimePosition", sendEvents = false), @j(datatype = "i4", defaultValue = "2147483647", name = "RelativeCounterPosition", sendEvents = false), @j(datatype = "i4", defaultValue = "2147483647", name = "AbsoluteCounterPosition", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "CurrentTransportActions", sendEvents = false), @j(allowedValuesEnum = SeekMode.class, name = "A_ARG_TYPE_SeekMode", sendEvents = false), @j(datatype = TypedValues.Custom.S_STRING, name = "A_ARG_TYPE_SeekTarget", sendEvents = false), @j(datatype = "ui4", name = "A_ARG_TYPE_InstanceID", sendEvents = false)})
public abstract class a implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PropertyChangeSupport f98414b = new PropertyChangeSupport(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @j(eventMaximumRateMilliseconds = 200)
    public final k f98413a = new k(new bs.a());

    @Override // ds.m
    public void b(k kVar, b bVar) throws Exception {
        c cVarE = e(bVar);
        f fVarG = g(bVar);
        es.g gVarH = h(bVar);
        d dVarF = f(bVar);
        es.b bVarD = d(bVar);
        kVar.a(bVar, new AVTransportVariable.a(URI.create(cVarE.a())), new AVTransportVariable.b(cVarE.b()), new AVTransportVariable.e(cVarE.c()), new AVTransportVariable.f(gVarH.a()), new AVTransportVariable.g(gVarH.b()), new AVTransportVariable.h(dVarF.c()), new AVTransportVariable.i(dVarF.d()), new AVTransportVariable.j(dVarF.g()), new AVTransportVariable.k(URI.create(dVarF.h())), new AVTransportVariable.l(c(bVar)), new AVTransportVariable.m(URI.create(cVarE.d())), new AVTransportVariable.n(cVarE.e()), new AVTransportVariable.o(cVarE.f()), new AVTransportVariable.p(bVarD.a()), new AVTransportVariable.q(bVarD.c()), new AVTransportVariable.r(bVarD.b()), new AVTransportVariable.s(cVarE.h()), new AVTransportVariable.t(cVarE.g()), new AVTransportVariable.w(fVarG.a()), new AVTransportVariable.x(fVarG.b()), new AVTransportVariable.y(fVarG.c()));
    }

    public abstract TransportAction[] c(b bVar) throws Exception;

    @er.d(out = {@er.f(getterName = "getPlayMediaString", name = "PlayMedia", stateVariable = "PossiblePlaybackStorageMedia"), @er.f(getterName = "getRecMediaString", name = "RecMedia", stateVariable = "PossibleRecordStorageMedia"), @er.f(getterName = "getRecQualityModesString", name = "RecQualityModes", stateVariable = "PossibleRecordQualityModes")})
    public abstract es.b d(@e(name = "InstanceID") b bVar) throws AVTransportException;

    @er.d(out = {@er.f(getterName = "getNumberOfTracks", name = "NrTracks", stateVariable = "NumberOfTracks"), @er.f(getterName = "getMediaDuration", name = "MediaDuration", stateVariable = "CurrentMediaDuration"), @er.f(getterName = "getCurrentURI", name = "CurrentURI", stateVariable = "AVTransportURI"), @er.f(getterName = "getCurrentURIMetaData", name = "CurrentURIMetaData", stateVariable = "AVTransportURIMetaData"), @er.f(getterName = "getNextURI", name = "NextURI", stateVariable = "NextAVTransportURI"), @er.f(getterName = "getNextURIMetaData", name = "NextURIMetaData", stateVariable = "NextAVTransportURIMetaData"), @er.f(getterName = "getPlayMedium", name = "PlayMedium", stateVariable = "PlaybackStorageMedium"), @er.f(getterName = "getRecordMedium", name = "RecordMedium", stateVariable = "RecordStorageMedium"), @er.f(getterName = "getWriteStatus", name = "WriteStatus", stateVariable = "RecordMediumWriteStatus")})
    public abstract c e(@e(name = "InstanceID") b bVar) throws AVTransportException;

    @er.d(out = {@er.f(getterName = "getTrack", name = "Track", stateVariable = "CurrentTrack"), @er.f(getterName = "getTrackDuration", name = "TrackDuration", stateVariable = "CurrentTrackDuration"), @er.f(getterName = "getTrackMetaData", name = "TrackMetaData", stateVariable = "CurrentTrackMetaData"), @er.f(getterName = "getTrackURI", name = "TrackURI", stateVariable = "CurrentTrackURI"), @er.f(getterName = "getRelTime", name = "RelTime", stateVariable = "RelativeTimePosition"), @er.f(getterName = "getAbsTime", name = "AbsTime", stateVariable = "AbsoluteTimePosition"), @er.f(getterName = "getRelCount", name = "RelCount", stateVariable = "RelativeCounterPosition"), @er.f(getterName = "getAbsCount", name = "AbsCount", stateVariable = "AbsoluteCounterPosition")})
    public abstract d f(@e(name = "InstanceID") b bVar) throws AVTransportException;

    @er.d(out = {@er.f(getterName = "getCurrentTransportState", name = "CurrentTransportState", stateVariable = "TransportState"), @er.f(getterName = "getCurrentTransportStatus", name = "CurrentTransportStatus", stateVariable = "TransportStatus"), @er.f(getterName = "getCurrentSpeed", name = "CurrentSpeed", stateVariable = "TransportPlaySpeed")})
    public abstract f g(@e(name = "InstanceID") b bVar) throws AVTransportException;

    @er.d(out = {@er.f(getterName = "getPlayMode", name = "PlayMode", stateVariable = "CurrentPlayMode"), @er.f(getterName = "getRecQualityMode", name = "RecQualityMode", stateVariable = "CurrentRecordQualityMode")})
    public abstract es.g h(@e(name = "InstanceID") b bVar) throws AVTransportException;
}
