package gs;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ds.k;
import ds.m;
import er.e;
import er.f;
import er.g;
import er.h;
import er.i;
import er.j;
import hs.c;
import hs.d;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.beans.PropertyChangeSupport;
import org.fourthline.cling.model.types.b;
import org.fourthline.cling.support.model.Channel;
import org.fourthline.cling.support.model.PresetName;
import org.fourthline.cling.support.renderingcontrol.RenderingControlException;
import org.fourthline.cling.support.renderingcontrol.lastchange.RenderingControlVariable;

/* JADX INFO: compiled from: AbstractAudioRenderingControl.java */
/* JADX INFO: loaded from: classes7.dex */
@g(serviceId = @h("RenderingControl"), serviceType = @i(value = "RenderingControl", version = 1), stringConvertibleTypes = {k.class})
@er.k({@j(datatype = TypedValues.Custom.S_STRING, name = "PresetNameList", sendEvents = false), @j(datatype = TypedValues.Custom.S_BOOLEAN, name = VastTagName.MUTE, sendEvents = false), @j(allowedValueMaximum = 100, allowedValueMinimum = 0, datatype = "ui2", name = "Volume", sendEvents = false), @j(allowedValueMaximum = 32767, allowedValueMinimum = -36864, datatype = "i2", name = "VolumeDB", sendEvents = false), @j(datatype = TypedValues.Custom.S_BOOLEAN, name = "Loudness", sendEvents = false), @j(allowedValuesEnum = Channel.class, name = "A_ARG_TYPE_Channel", sendEvents = false), @j(allowedValuesEnum = PresetName.class, name = "A_ARG_TYPE_PresetName", sendEvents = false), @j(datatype = "ui4", name = "A_ARG_TYPE_InstanceID", sendEvents = false)})
public abstract class a implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PropertyChangeSupport f62938b = new PropertyChangeSupport(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @j(eventMaximumRateMilliseconds = 200)
    public final k f62937a = new k(new hs.i());

    @Override // ds.m
    public void b(k kVar, b bVar) throws Exception {
        for (Channel channel : c()) {
            String strName = channel.name();
            kVar.a(bVar, new RenderingControlVariable.j(new hs.b(channel, Boolean.valueOf(e(bVar, strName)))), new RenderingControlVariable.i(new hs.a(channel, Boolean.valueOf(d(bVar, strName)))), new RenderingControlVariable.p(new c(channel, Integer.valueOf(f(bVar, strName).c().intValue()))), new RenderingControlVariable.q(new d(channel, g(bVar, strName))), new RenderingControlVariable.k(PresetName.FactoryDefaults.name()));
        }
    }

    public abstract Channel[] c();

    @er.d(out = {@f(name = "CurrentLoudness", stateVariable = "Loudness")})
    public boolean d(@e(name = "InstanceID") b bVar, @e(name = "Channel") String str) throws RenderingControlException {
        return false;
    }

    @er.d(out = {@f(name = "CurrentMute", stateVariable = VastTagName.MUTE)})
    public abstract boolean e(@e(name = "InstanceID") b bVar, @e(name = "Channel") String str) throws RenderingControlException;

    @er.d(out = {@f(name = "CurrentVolume", stateVariable = "Volume")})
    public abstract org.fourthline.cling.model.types.d f(@e(name = "InstanceID") b bVar, @e(name = "Channel") String str) throws RenderingControlException;

    @er.d(out = {@f(name = "CurrentVolume", stateVariable = "VolumeDB")})
    public Integer g(@e(name = "InstanceID") b bVar, @e(name = "Channel") String str) throws RenderingControlException {
        return 0;
    }
}
