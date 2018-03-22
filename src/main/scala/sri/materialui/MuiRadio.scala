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
 @JSImport("material-ui/Radio",JSImport.Default)
object MuiRadioComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiRadio {
    
    @inline
    def apply(value : OptionalParam[String] = OptDefault,
id : OptionalParam[String] = OptDefault,
disabledClassName : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
icon : OptionalParam[ReactNode] = OptDefault,
checkedClassName : OptionalParam[String] = OptDefault,
defaultChecked : OptionalParam[Boolean] = OptDefault,
onChange : OptionalParam[(ReactEventH,Boolean) => _] = OptDefault,
disabled : OptionalParam[Boolean] = OptDefault,
checked : OptionalParam[Boolean | String] = OptDefault,
disableRipple : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
inputProps : OptionalParam[js.Object] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
tabIndex : OptionalParam[String] = OptDefault,
name : OptionalParam[String] = OptDefault,
checkedIcon : OptionalParam[ReactNode] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiRadioComponent.type, Unit] = null): ReactElement { type Instance = MuiRadioComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiRadioComponent.type](
      MuiRadioComponent,
      props,
      key,
      ref)
    }
 }

 
       
         


     

         
