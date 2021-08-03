/*
 * Copyright 2010 The WicketForge-Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package wicketforge.templates;

import com.intellij.ide.fileWicketForges.FileWicketForgeDescriptor;
import com.intellij.ide.fileWicketForges.FileWicketForgeGroupDescriptor;
import com.intellij.ide.fileWicketForges.FileWicketForgeGroupDescriptorFactory;
import wicketforge.Constants;

/**
 * WicketFileWicketForgeGroupFactory
 */
public class WicketFileWicketForgeGroupFactory implements FileWicketForgeGroupDescriptorFactory, WicketWicketForges {
    
    @Override
    public FileWicketForgeGroupDescriptor getFileWicketForgesDescriptor() {
        final FileWicketForgeGroupDescriptor groupDescriptor = new FileWicketForgeGroupDescriptor("Wicket", Constants.WICKET_ICON);
        groupDescriptor.addWicketForge(new FileWicketForgeDescriptor(WICKET_PAGE_HTML));
        groupDescriptor.addWicketForge(new FileWicketForgeDescriptor(WICKET_PANEL_HTML));
        groupDescriptor.addWicketForge(new FileWicketForgeDescriptor(WICKET_BORDER_HTML));
        groupDescriptor.addWicketForge(new FileWicketForgeDescriptor(WICKET_PROPERTIES));
        groupDescriptor.addWicketForge(new FileWicketForgeDescriptor(WICKET_PROPERTIES_XML));
        return groupDescriptor;
    }
    
}
