package mq;

import com.ironsource.Y1;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

/* JADX INFO: compiled from: ShutdownMonitor.java */
/* JADX INFO: loaded from: classes6.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f74988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f74989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f74990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f74991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ServerSocket f74992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f74993f;

    /* JADX INFO: compiled from: ShutdownMonitor.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static u f74994a = new u();
    }

    /* JADX INFO: compiled from: ShutdownMonitor.java */
    public class c extends Thread {
        public c() {
            setDaemon(true);
            setName("ShutdownMonitor");
        }

        public final void a() {
            if (u.this.f74989b < 0) {
                if (u.this.f74988a) {
                    System.err.println("ShutdownMonitor not in use (port < 0): " + u.this.f74989b);
                    return;
                }
                return;
            }
            try {
                try {
                    u.this.f74992e = new ServerSocket(u.this.f74989b, 1, InetAddress.getByName("127.0.0.1"));
                    if (u.this.f74989b == 0) {
                        u uVar = u.this;
                        uVar.f74989b = uVar.f74992e.getLocalPort();
                        System.out.printf("STOP.PORT=%d%n", Integer.valueOf(u.this.f74989b));
                    }
                    if (u.this.f74990c == null) {
                        u.this.f74990c = Long.toString((long) ((Math.random() * 9.223372036854776E18d) + ((double) hashCode()) + System.currentTimeMillis()), 36);
                        System.out.printf("STOP.KEY=%s%n", u.this.f74990c);
                    }
                    u uVar2 = u.this;
                    uVar2.o("STOP.PORT=%d", Integer.valueOf(uVar2.f74989b));
                    u uVar3 = u.this;
                    uVar3.o("STOP.KEY=%s", uVar3.f74990c);
                    u uVar4 = u.this;
                    uVar4.o("%s", uVar4.f74992e);
                } catch (Exception e10) {
                    u.this.p(e10);
                    System.err.println("Error binding monitor port " + u.this.f74989b + ": " + e10.toString());
                    u.this.f74992e = null;
                    u uVar5 = u.this;
                    uVar5.o("STOP.PORT=%d", Integer.valueOf(uVar5.f74989b));
                    u uVar6 = u.this;
                    uVar6.o("STOP.KEY=%s", uVar6.f74990c);
                    u uVar7 = u.this;
                    uVar7.o("%s", uVar7.f74992e);
                }
            } catch (Throwable th2) {
                u uVar8 = u.this;
                uVar8.o("STOP.PORT=%d", Integer.valueOf(uVar8.f74989b));
                u uVar9 = u.this;
                uVar9.o("STOP.KEY=%s", uVar9.f74990c);
                u uVar10 = u.this;
                uVar10.o("%s", uVar10.f74992e);
                throw th2;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            Socket socketAccept;
            Throwable th2;
            Exception e10;
            LineNumberReader lineNumberReader;
            if (u.this.f74992e == null) {
                return;
            }
            while (u.this.f74992e != null) {
                Socket socket = null;
                try {
                    socketAccept = u.this.f74992e.accept();
                    try {
                        try {
                            lineNumberReader = new LineNumberReader(new InputStreamReader(socketAccept.getInputStream()));
                        } catch (Throwable th3) {
                            th2 = th3;
                            u.this.n(socketAccept);
                            throw th2;
                        }
                    } catch (Exception e11) {
                        e10 = e11;
                        u.this.p(e10);
                        System.err.println(e10.toString());
                    }
                } catch (Exception e12) {
                    socketAccept = null;
                    e10 = e12;
                } catch (Throwable th4) {
                    socketAccept = null;
                    th2 = th4;
                }
                if (u.this.f74990c.equals(lineNumberReader.readLine())) {
                    OutputStream outputStream = socketAccept.getOutputStream();
                    String line = lineNumberReader.readLine();
                    u.this.o("command=%s", line);
                    if ("stop".equals(line)) {
                        u.this.o("Issuing graceful shutdown..", new Object[0]);
                        ar.c.b().run();
                        u.this.o("Informing client that we are stopped.", new Object[0]);
                        outputStream.write("Stopped\r\n".getBytes("UTF-8"));
                        outputStream.flush();
                        u.this.o("Shutting down monitor", new Object[0]);
                        u.this.n(socketAccept);
                        u uVar = u.this;
                        uVar.m(uVar.f74992e);
                        u.this.f74992e = null;
                        if (u.this.f74991d) {
                            u.this.o("Killing JVM", new Object[0]);
                            System.exit(0);
                        }
                    } else {
                        if ("status".equals(line)) {
                            outputStream.write("OK\r\n".getBytes("UTF-8"));
                            outputStream.flush();
                        }
                        socket = socketAccept;
                    }
                    u.this.n(socket);
                } else {
                    System.err.println("Ignoring command with incorrect key");
                    u.this.n(socketAccept);
                }
            }
        }

        @Override // java.lang.Thread
        public void start() {
            if (isAlive()) {
                System.err.printf("ShutdownMonitorThread already started", new Object[0]);
                return;
            }
            a();
            if (u.this.f74992e == null) {
                return;
            }
            if (u.this.f74988a) {
                System.err.println("Starting ShutdownMonitorThread");
            }
            super.start();
        }
    }

    public u() {
        Properties properties = System.getProperties();
        this.f74988a = properties.containsKey("DEBUG");
        this.f74989b = Integer.parseInt(properties.getProperty("STOP.PORT", Y1.f30690f));
        this.f74990c = properties.getProperty("STOP.KEY", null);
        this.f74991d = true;
    }

    public static u q() {
        return b.f74994a;
    }

    public final void m(ServerSocket serverSocket) {
        if (serverSocket == null) {
            return;
        }
        try {
            serverSocket.close();
        } catch (IOException unused) {
        }
    }

    public final void n(Socket socket) {
        if (socket == null) {
            return;
        }
        try {
            socket.close();
        } catch (IOException unused) {
        }
    }

    public final void o(String str, Object... objArr) {
        if (this.f74988a) {
            System.err.printf("[ShutdownMonitor] " + str + "%n", objArr);
        }
    }

    public final void p(Throwable th2) {
        if (this.f74988a) {
            th2.printStackTrace(System.err);
        }
    }

    public void r() throws Exception {
        synchronized (this) {
            c cVar = this.f74993f;
            if (cVar != null && cVar.isAlive()) {
                System.err.printf("ShutdownMonitorThread already started", new Object[0]);
                return;
            }
            c cVar2 = new c();
            this.f74993f = cVar2;
            cVar2.start();
        }
    }

    public String toString() {
        return String.format("%s[port=%d]", getClass().getName(), Integer.valueOf(this.f74989b));
    }
}
