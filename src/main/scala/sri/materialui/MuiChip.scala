package sri.materialui


import sri.core._
import sri.universal._

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import sri.web.vdom.DOMProps
import org.scalajs.dom
import scalajsplus.macros.{FunctionObjectMacro, exclude}
import scalajsplus.{OptDefault, OptionalParam, DangerousUnionToJSAnyImplicit}
import sri.web.vdom.ReactEventAliases._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|





 @js.native
 @JSImport("material-ui/Chip",JSImport.Default)
object MuiChipComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiChip {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
label : OptionalParam[ReactNode] = OptDefault,
avatar : OptionalParam[ReactNode] = OptDefault,
onKeyDown : OptionalParam[js.Function] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
tabIndex : OptionalParam[Double | Int] = OptDefault,
onRequestDelete : OptionalParam[js.Function] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiChipComponent.type, Unit] = null): ReactElement { type Instance = MuiChipComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiChipComponent.type](
      MuiChipComponent,
      props,
      key,
      ref)
    }
 }

 
       
         


     

         
