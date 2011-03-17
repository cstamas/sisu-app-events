package org.sonatype.plexus.appevents;

import javax.inject.Inject;

//TODO: dispose is gone now, need some other means to remove listener automagically
public abstract class AbstractApplicationEventListener
    implements EventListener
{
    @Inject
    public AbstractApplicationEventListener( ApplicationEventMulticaster applicationEventMulticaster )
    {
        applicationEventMulticaster.addEventListener( this );
    }
}
