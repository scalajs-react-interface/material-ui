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
 @JSImport("material-ui/Ripple",JSImport.Default)
object MuiRippleComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiRipple {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
rippleX : Double | Int,
rippleSize : Double | Int,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
pulsate : OptionalParam[Boolean] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
rippleY : Double | Int,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiRippleComponent.type, Unit] = null): ReactElement { type Instance = MuiRippleComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiRippleComponent.type](
      MuiRippleComponent,
      props,
      key,
      ref)
    }
 }

 
       
         


     

         
