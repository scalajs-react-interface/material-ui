
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
 @JSImport("material-ui/Dialog","DialogTitle")
object MuiDialogTitleComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiDialogTitle {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
disableTypography : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiDialogTitleComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiDialogTitleComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiDialogTitleComponent.type](
      MuiDialogTitleComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiDialogTitleC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiDialogTitleComponent.type](
      MuiDialogTitleComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         


     

         