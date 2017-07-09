
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
 @JSImport("material-ui/Avatar",JSImport.Default)
object MuiAvatarComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiAvatar {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
srcSet : OptionalParam[String] = OptDefault,
sizes : OptionalParam[String] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
imgProps : OptionalParam[js.Object] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
childrenClassName : OptionalParam[String] = OptDefault,
src : OptionalParam[String] = OptDefault,
alt : OptionalParam[String] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiAvatarComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiAvatarComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiAvatarComponent.type](
      MuiAvatarComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiAvatarC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiAvatarComponent.type](
      MuiAvatarComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         


     

         