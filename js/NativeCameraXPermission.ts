import type { TurboModule } from 'react-native/Libraries/TurboModule/RCTExport';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
    // TODO: interface for this module
    //   add(a: number, b: number): Promise<number>;
    
}

export default TurboModuleRegistry.get<Spec>(
    'RTNCameraX',
) as Spec | null;