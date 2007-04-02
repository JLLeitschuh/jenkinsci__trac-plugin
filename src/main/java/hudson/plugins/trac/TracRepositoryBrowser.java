package hudson.plugins.trac;

import hudson.model.Descriptor;
import hudson.scm.RepositoryBrowser;
import hudson.scm.SubversionChangeLogSet.LogEntry;
import hudson.scm.SubversionChangeLogSet.Path;
import hudson.scm.SubversionRepositoryBrowser;
import org.kohsuke.stapler.StaplerRequest;

import java.io.IOException;
import java.net.URL;

/**
 * {@link SubversionRepositoryBrowser} that produces Trac links.
 */
public class TracRepositoryBrowser extends SubversionRepositoryBrowser {
    public TracRepositoryBrowser() {
    }

    public URL getDiffLink(Path path) throws IOException {
        // TODO
        throw new UnsupportedOperationException();
    }

    public URL getFileLink(Path path) throws IOException {
        // TODO
        throw new UnsupportedOperationException();
    }

    public URL getChangeSetLink(LogEntry changeSet) throws IOException {
        // TODO
        throw new UnsupportedOperationException();
    }

    public DescriptorImpl getDescriptor() {
        return DESCRIPTOR;
    }

    public static final DescriptorImpl DESCRIPTOR = new DescriptorImpl();

    public static final class DescriptorImpl extends Descriptor<RepositoryBrowser<?>> {
        public DescriptorImpl() {
            super(TracRepositoryBrowser.class);
        }

        public String getDisplayName() {
            return "Trac";
        }

        public TracRepositoryBrowser newInstance(StaplerRequest req) throws FormException {
            return new TracRepositoryBrowser();
        }
    }
}
