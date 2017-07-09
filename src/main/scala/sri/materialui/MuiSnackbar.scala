
package sri.materialui;


import sri.core._
import sri.macros.{
  FunctionObjectMacro,
  exclude,
  rename,
  OptDefault,
  OptionalParam
}
import sri.universal._
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.annotation.ScalaJSDefined
import sri.web.vdom.DOMProps
import org.scalajs.dom
import sri.web.vdom.ReactEventAliases._
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|
     




 @js.native
 @JSImport("material-ui/Snackbar",JSImport.Default)
object MuiSnackbarComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiSnackbar {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
leaveTransitionDuration : OptionalParam[Double | Int] = OptDefault,
className : OptionalParam[String] = OptDefault,
enterTransitionDuration : OptionalParam[Double | Int] = OptDefault,
autoHideDuration : OptionalParam[Double | Int] = OptDefault,
transition : OptionalParam[js.Function | ReactElement] = OptDefault,
onRequestClose : OptionalParam[(ReactEventH,String) => _] = OptDefault,
anchorOrigin : OptionalParam[js.Object] = OptDefault,
SnackbarContentProps : OptionalParam[js.Object] = OptDefault,
onEnter : OptionalParam[js.Function] = OptDefault,
onExited : OptionalParam[js.Function] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
onMouseLeave : OptionalParam[js.Function] = OptDefault,
onExiting : OptionalParam[js.Function] = OptDefault,
message : OptionalParam[ReactElement] = OptDefault,
onExit : OptionalParam[js.Function] = OptDefault,
onEntered : OptionalParam[js.Function] = OptDefault,
open : Boolean,
onMouseEnter : OptionalParam[js.Function] = OptDefault,
onEntering : OptionalParam[js.Function] = OptDefault,
action : OptionalParam[ReactElement] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiSnackbarComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiSnackbarComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiSnackbarComponent.type](
      MuiSnackbarComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
       
         


     

         