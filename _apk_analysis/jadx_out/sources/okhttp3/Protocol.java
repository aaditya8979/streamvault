package okhttp3;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String protocol;

    /* JADX INFO: compiled from: Protocol.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final Protocol get(@NotNull String str) throws IOException {
            p.k(str, "protocol");
            Protocol protocol = Protocol.HTTP_1_0;
            if (!p.f(str, protocol.protocol)) {
                protocol = Protocol.HTTP_1_1;
                if (!p.f(str, protocol.protocol)) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!p.f(str, protocol.protocol)) {
                        protocol = Protocol.HTTP_2;
                        if (!p.f(str, protocol.protocol)) {
                            protocol = Protocol.SPDY_3;
                            if (!p.f(str, protocol.protocol)) {
                                protocol = Protocol.QUIC;
                                if (!p.f(str, protocol.protocol)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    @NotNull
    public static final Protocol get(@NotNull String str) throws IOException {
        return Companion.get(str);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.protocol;
    }
}
