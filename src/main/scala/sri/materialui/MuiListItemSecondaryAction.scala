
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
 @JSImport("material-ui/List","ListItemSecondaryAction")
object MuiListItemSecondaryActionComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiListItemSecondaryAction {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiListItemSecondaryActionComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiListItemSecondaryActionComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiListItemSecondaryActionComponent.type](
      MuiListItemSecondaryActionComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiListItemSecondaryActionC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiListItemSecondaryActionComponent.type](
      MuiListItemSecondaryActionComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         


     

         